package Modelos.Puntos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Puntos[] puntos = new Puntos[10];
        int opcion = 0;

        do {
            System.out.println("1. Crear punto");
            System.out.println("2. Calcular distancia desde origen");
            System.out.println("3. Calcular distancia entre puntos");
            System.out.println("4. Verificar si los puntos estan alineados");
            System.out.println("5. Mostrar todos los puntos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del eje X: ");
                    int X = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingres el valor del eje Y: ");
                    int Y = scanner.nextInt();
                    scanner.nextLine();
                    Puntos nuevoPunto = new Puntos();
                    nuevoPunto.setX(X);
                    nuevoPunto.setY(Y);
                    System.out.println("Punto creado!");
                    nuevoPunto.imprimirPunto();
                    puntos[Puntos.contador - 1] = nuevoPunto;
                    break;
                case 2:
                    System.out.print("Ingrese el indice de un punto: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    int distancia = puntos[indice].distanciaDesdeOrigen();
                    System.out.println("La distancia desde el origen al punto es: " + distancia);
                    break;
                case 3:
                    System.out.print("Ingrese el indice de un punto: ");
                    int indice1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el indice de otro punto: ");
                    int indice2 = scanner.nextInt();
                    scanner.nextLine();
                    int distanciaDosPuntos = Puntos.calcularDistancia(puntos[indice1], puntos[indice2]);
                    System.out.println("La distancia entre los puntos es: " + distanciaDosPuntos);
                    break;
                case 4:
                    System.out.print("Ingrese el indice de un punto: ");
                    int indice1_ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el indice de otro punto: ");
                    int indice2_ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el indice de otro punto: ");
                    int indice3_ = scanner.nextInt();
                    scanner.nextLine();
                    boolean alineados = Puntos.estanAlineados(puntos[indice1_], puntos[indice2_], puntos[indice3_]);
                    if (alineados) {
                        System.out.println("Los puntos están alineados");
                    } else {
                        System.out.println("Los puntos no están alineados");
                    }
                    break;
                case 5:
                    for (int i = 0; i < puntos.length; i++) {
                        if (puntos[i] != null) {
                            System.out.println("Punto " + (i) + ":");
                            puntos[i].imprimirPunto();
                        }
                    }
                    break;
                case 6:
                System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese una opción del 1 al 4.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
