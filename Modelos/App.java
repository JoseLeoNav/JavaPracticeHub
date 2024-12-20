package Modelos;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("---Menú---");
            System.out.println("1. Crear triangulo");
            System.out.println("2. Crear rectangulo");
            System.out.println("3. Crear circulo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese base: ");
                    int base = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese altura: ");
                    int altura = scanner.nextInt();
                    scanner.nextLine();
                    Triangulo triangulo = new Triangulo();
                    triangulo.setBase(base);
                    triangulo.setAlto(altura);
                    triangulo.imprimir();
                    break;

                case 2:
                    System.out.print("Ingrese ancho: ");
                    int ancho = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese altura: ");
                    int alto = scanner.nextInt();
                    scanner.nextLine();
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.setAncho(ancho);
                    rectangulo.setAlto(alto);
                    rectangulo.imprimir();
                break;

                case 3:
                    System.out.print("Ingrese el radio: ");
                    int radio = scanner.nextInt();
                    scanner.nextLine();
                    Circulo circulo = new Circulo();
                    circulo.setRadio(radio);
                    circulo.imprimir();
                break;
                
                case 4:
                System.out.println("Adios!");
                break;

                default:
                System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }

}
