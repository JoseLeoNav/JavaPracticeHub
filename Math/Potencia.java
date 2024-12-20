package Math;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base de la potencia: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente de la potencia: ");
        double exp = scanner.nextDouble();
        double potencia = Math.pow(base, exp);
        System.out.println("La potencia resultante es: "+ Math.round(potencia));
        scanner.close();
    }
}
