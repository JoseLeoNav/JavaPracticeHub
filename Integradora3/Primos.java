package Integradora3;

import java.util.Scanner;

public interface Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números primos que deseas obtener: ");
        int cantidadDeseada = scanner.nextInt();
        scanner.close();
        int[] primos = new int[cantidadDeseada];
        int contador = 0;
        int num = 2;

        while (contador < cantidadDeseada) {
            boolean esPrimo = true;

            if (num <= 1) {
                esPrimo = false;
            } else if (num == 2) {
                esPrimo = true;
            } else if (num % 2 == 0) {
                esPrimo = false;
            } else {
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        esPrimo = false;
                    }
                }
            }

            if (esPrimo) {
                primos[contador] = num;
                contador++;
            }

            num++;
        }

        System.out.println("Los primeros " + cantidadDeseada + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}