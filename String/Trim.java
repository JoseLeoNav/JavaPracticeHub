package String;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto con espacios en blanco a los lados: ");
        String texto = scanner.nextLine();
        String trim = texto.trim();
        System.out.println("Este es su texto sin espacios: " +trim +" |||");
        scanner.close();
    }

}
