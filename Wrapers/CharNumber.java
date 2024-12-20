package Wrapers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String numeroConvert = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Ingrese un número: ");
            try {
                numero = scanner.nextInt();
                numeroConvert = Integer.toString(numero);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número entero válido.");
                scanner.next();
            }
        }

        int contador = 0;
        for (int i = 0; i < numeroConvert.length(); i++) {
            char cha = numeroConvert.charAt(i);
            if (Character.isDigit(cha)) {
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " cifras.");
        scanner.close();
    }
}
