package Math;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        try {
            float numero = scanner.nextFloat();
            int ent = Math.round(numero);
            System.out.println("El número más cercano a " + numero + " es " + ent);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese un número decimal válido.");
        } finally {
            scanner.close();
        }
    }
}
