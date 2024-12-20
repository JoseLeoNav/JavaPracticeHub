package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Ciudades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        int opcion = 0;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1.- Agregar una ciudad");
            System.out.println("2.- Salir y mostrar ciudades agregadas");
            System.out.print("Eliga una opción:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = scanner.nextLine();
                    ciudades.add(ciudad);
                    break;
                case 2:
                    if (ciudades.isEmpty()) {
                        System.out.println("No hay ciudades agregadas.");
                        break;
                    } else {
                        System.out.println("Ciudades agregadas:");
                        for (String c : ciudades) {
                            System.out.println(c);
                        }
                        break;
                    }
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 2);
        scanner.close();
    }
}
