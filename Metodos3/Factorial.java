package Metodos3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int factorial= factorial(numero);
        System.out.println("El factorial de " +numero+" es " + factorial);
        scanner.close();
    }

    public static int factorial(int numero) {
    if(numero == 0) return 1;
    else return numero * factorial(numero - 1);    
    }
}
