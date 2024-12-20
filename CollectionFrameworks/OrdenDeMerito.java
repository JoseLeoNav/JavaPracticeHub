package CollectionFrameworks;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenDeMertico {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1.- Agregar una nota");
            System.out.println("2.- Salir y mostrar ciudades agregadas");
            System.out.print("Eliga una opción:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nota: ");
                    int nota = scanner.nextInt();
                    scanner.nextLine();
                    if (nota > 0 && nota <= 10) {
                        notas.add(nota);
                    } else {
                        System.out.println("Nota inválida. Debe estar entre 1 y 10.");
                    }
                    break;
                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas agregadas.");
                        break;
                    } else {
                        System.out.println("Notas agregadas:");
                        System.out.println("");
                        System.out.println("Ascendente");
                        Collections.sort(notas);
                        for (int n : notas) {
                            System.out.println(n);
                        }
                        System.out.println("");
                        System.out.println("Descendente");
                        Collections.sort(notas, Comparator.reverseOrder());

                        for (int n : notas) {
                            System.out.println(n);
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
