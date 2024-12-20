package Wrapers;

import java.util.Scanner;

public class DoubleConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese un número decimal o entero: ");
        try {
            String numero = scanner.nextLine();
            double newNumber = Double.valueOf(numero);
            System.out.println("El string convertido a double es: " + newNumber);
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese una entrada válida. ");
        }
        scanner.close();
    }
}
