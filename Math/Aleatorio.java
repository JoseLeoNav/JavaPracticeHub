package Math;

import java.util.Scanner;

public class Ale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 30: ");
        int numeroLimite = scanner.nextInt();
        double random = Math.random();
        int numero = (int) Math.floor(random * numeroLimite) + 1;
        int cantidad = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cantidad++;
            }
        }
        if (numeroLimite > 30 || numeroLimite < 1) {
            System.out.println("Por favor ingrese un número válido.");
        } else if (cantidad > 2) {
            System.out.println(
                    "El número generado es " + numero + " y su potencia al cuadrado es "
                            + Math.round(Math.pow(numero, 2)));
        } else {
            System.out.println(
                    "El número generado es " + numero + " y es menor o igual a 2. Su potencia al cuadrado es "
                            + Math.round(Math.pow(numero, 2)));
        }
        scanner.close();
    }
}
