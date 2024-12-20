package Wrapers;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        try {
            System.out.print("Por favor ingrese un número decimal : ");
            num1 = scanner.nextLine();
            System.out.print("Por favor ingrese un número entero : ");
            num2 = scanner.nextLine();

            double num1Convert = Double.valueOf(num1);
            int num2Convert = Integer.valueOf(num2);
            double suma  = num1Convert + num2Convert;
            System.out.println("La suma de ambos números es " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese el tipo de valor indicado.");
        } finally {
            scanner.close();
        }
    }
}
