package Math;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        if (numero < 0) {
            System.out.print(
                    "El cuadrado del valor absoluto de " + Math.round(numero) + " es " + Math.sqrt(Math.abs(numero)));
        } else {
            System.out.print("El cuadrado de " + Math.round(numero) + " es " + Math.sqrt(numero));
        }
        scanner.close();
    }
}
