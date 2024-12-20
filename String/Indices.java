package String;

import java.util.Scanner;

public class Indices {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese un número que sirva como índice inicial: ");
        int in1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese un número que sirva como índice final: ");
        int in2 = scanner.nextInt();
        scanner.nextLine();
        String subcadena = texto.substring(in1, in2);
        System.out.println("La subcadena resultante es: " +subcadena);
        scanner.close();
    }
    
}
