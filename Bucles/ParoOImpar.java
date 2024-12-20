package Bucles;

import java.util.Scanner;

public class ParoIMpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] serie = new int[4];
        boolean continuar = true;

        while (continuar) {
            int impares = 0;
            int pares = 0;

            System.out.println("Por favor ingrese 4 números: ");
            for (int i = 0; i < 4; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                serie[i] = scanner.nextInt();
                scanner.nextLine();
            }

            for (int i = 0; i < 4; i++) {
                if (serie[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.println("El número de impares es " + impares + " y el número de pares es " + pares);
            System.out.println("¿Desea continuar?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            int respuesta = scanner.nextInt();
            scanner.nextLine();

            if (respuesta == 2) {
                continuar = false;
            }
        }
        scanner.close();
    }
}
