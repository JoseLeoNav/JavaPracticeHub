package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero: ");
            int num1 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese otro: ");
            int num2 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("La diferencia entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un caracter válido");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            scanner.close();
        }
    }
}
