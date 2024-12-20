package String;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto1 = scanner.nextLine();
        System.out.println("Ingrese otra cadena de texto: ");
        String texto2 = scanner.nextLine();
        boolean condition = texto1.equals(texto2);
        if (condition) {
            System.out.println("Los textos son iguales.");
        } else {
            System.out.println("Los textos son diferentes.");
        }
        scanner.close();
    }

}
