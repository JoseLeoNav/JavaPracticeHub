package Integradora4;

import java.util.Arrays;
import java.util.Scanner;

public class Oraciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = "";
        int opcion = 0;

        while (opcion != 9) {
            opcion = mostrarMenu(scanner, oracion);
            procesarOpcion(opcion, scanner, oracion);
        }

        scanner.close();
    }

    public static int mostrarMenu(Scanner scanner, String oracion) {
        System.out.println("Seleccione una opción: ");
        if (oracion.isEmpty()) {
            System.out.println("1.- Crear oración");
        } else {
            System.out.println("1.- Borrar oración");
        }
        System.out.println("2.- Calcular cantidad de caracteres");
        System.out.println("3.- Calcular cantidad de palabras");
        System.out.println("4.- Mostrar en orden alfabético");
        System.out.println("5.- Buscar palabra por índice");
        System.out.println("6.- Verificar palabra");
        System.out.println("7.- Modificar palabra");
        System.out.println("8.- Agregar contenido");
        System.out.println("9.- Salir");
        System.out.print("Elija una opción: ");
        return scanner.nextInt();
    }

    public static void procesarOpcion(int opcion, Scanner scanner, String oracion) {
        scanner.nextLine(); // Consumir el salto de línea
        switch (opcion) {
            case 1 -> oracion = manejarOracion(scanner, oracion);
            case 2 -> System.out.println("Cantidad de caracteres: " + oracion.length());
            case 3 -> System.out.println("Cantidad de palabras: " + contarPalabras(oracion));
            case 4 -> mostrarPalabrasOrdenadas(oracion);
            case 5 -> buscarPalabraPorIndice(scanner, oracion);
            case 6 -> verificarPalabra(scanner, oracion);
            case 7 -> oracion = modificarPalabra(scanner, oracion);
            case 8 -> oracion = agregarContenido(scanner, oracion);
            case 9 -> System.out.println("Saliendo del programa.");
            default -> System.out.println("Por favor ingrese una opción válida");
        }
    }

    public static String manejarOracion(Scanner scanner, String oracion) {
        if (oracion.isEmpty()) {
            System.out.println("Ingrese la nueva oración: ");
            return scanner.nextLine();
        } else {
            System.out.println("Oración borrada.");
            return "";
        }
    }

    public static int contarPalabras(String oracion) {
        return oracion.isEmpty() ? 0 : oracion.split("\\s+").length;
    }

    public static void mostrarPalabrasOrdenadas(String oracion) {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras en orden alfabético: " + String.join(" ", palabras));
    }

    public static void buscarPalabraPorIndice(Scanner scanner, String oracion) {
        String[] palabras = oracion.split("\\s+");
        System.out.print("Por favor ingrese el índice de la palabra que desea encontrar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice >= 1 && indice <= palabras.length) {
            System.out.println("Esta es la palabra que busca: " + palabras[indice - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    public static void verificarPalabra(Scanner scanner, String oracion) {
        System.out.print("Ingrese la palabra a verificar: ");
        String palabra = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabra.equals(palabras[i])) {
                encontrada = true;
                System.out.println("La palabra \"" + palabra + "\" está en la oración en la posición " + (i + 1));
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra \"" + palabra + "\" no está en la oración.");
        }
    }

    public static String modificarPalabra(Scanner scanner, String oracion) {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabraModificar = scanner.nextLine();
        if (oracion.contains(palabraModificar)) {
            System.out.print("Ingrese la nueva palabra: ");
            String nuevaPalabra = scanner.nextLine();
            return oracion.replace(palabraModificar, nuevaPalabra);
        } else {
            System.out.println("La palabra no se encuentra en la oración.");
            return oracion;
        }
    }

    public static String agregarContenido(Scanner scanner, String oracion) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        return oracion + " " + contenido;
    }
}
