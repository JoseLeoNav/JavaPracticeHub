package String;

import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + longitud);
        scanner.close();
    }
}
