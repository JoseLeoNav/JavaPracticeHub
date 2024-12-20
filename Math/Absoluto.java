package Math;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número cualquiera: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int abs = Math.abs(numero);
        System.out.print("El valor absoluto de " + numero + " es " + abs);
        scanner.close();
    }

}
