package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Turnero {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1.- Agregar un número de turno");
            System.out.println("2.- Atender un turno");
            System.out.println("3.- Sortear un turno para atender");
            System.out.println("4.- Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número de turno: ");
                    int numeroTurno = scanner.nextInt();
                    scanner.nextLine();
                    numeros.add(numeroTurno);
                    System.out.println("Turno agregado!");
                    break;

                case 2:
                    if (numeros.isEmpty()) {
                        System.out.println("No hay turnos para atender.");
                    } else {
                        System.out.println("Turnos disponibles para atender:");
                        System.out.println("N\tTurno");
                        int N = 1;
                        for (int turno : numeros) {
                            System.out.println(N + "\t" + turno);
                            N++;
                        }
                        System.out.print("Ingrese el número de turno a atender (N): ");
                        int turnoAtender = scanner.nextInt();
                        scanner.nextLine();

                        if (turnoAtender > 0 && turnoAtender <= numeros.size()) {
                            int turnoRemovido = numeros.remove(turnoAtender - 1);
                            System.out.println("Atendiendo el turno: " + turnoRemovido);
                            System.out.println("Actualizacion de turnos disponibles para atender:");
                            System.out.println("N\tTurno");
                            int N2 = 1;
                            for (int turno : numeros) {
                                System.out.println(N2 + "\t" + turno);
                                N++;
                            }
                        } else {
                            System.out.println("Turno inválido.");
                        }
                    }
                    break;

                case 3:
                    int random = (int) (Math.random() * numeros.size());
                    System.out.println("Turno sorteado: " + numeros.get(random) + "  Numero de turno: " + random+1);
                    numeros.remove(random);
                    System.out.println("Actualizacion de turnos disponibles para atender:");
                    System.out.println("N\tTurno");
                    int N = 1;
                    for (int turno : numeros) {
                        System.out.println(N + "\t" + turno);
                        N++;
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}
