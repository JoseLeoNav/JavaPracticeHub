package Integradora3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese un número: ");
        int numero = scanner.nextInt();
        int numero_0 = 1;
        int factorial = 1;
        scanner.close();
        do {
            factorial = factorial * (numero_0 + 1);
            numero_0++;
        } while (numero_0 < numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}