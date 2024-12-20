package TryCatch;

import java.util.Scanner;

public class Caracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String caracteres = scanner.nextLine();

        try {
            int numero = Integer.parseInt(caracteres);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena no contiene un número válido.");
        }
        scanner.close();
    }
}
