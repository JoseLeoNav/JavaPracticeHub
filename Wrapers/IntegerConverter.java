package Wrapers;

import java.util.Scanner;

public class IntegerConverter {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese un número entero: ");
        try {
            String numero = scanner.nextLine();
            int newNumber = Integer.valueOf(numero);
            System.out.println("El string convertido a entero es: " + newNumber);
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese una entrada válida. ");
        }
        scanner.close();
    }
}
