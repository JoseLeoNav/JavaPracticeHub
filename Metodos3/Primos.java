package Metodos3;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            boolean esPrimo = esPrimo(numero);
            if (esPrimo) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        } while (numero != 0);
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        return esPrimoRecursivo(numero, 2);
    }

    private static boolean esPrimoRecursivo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        } else if (divisor * divisor > numero) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        } else {
            return esPrimoRecursivo(numero, divisor + 1);
        }
    }
}
