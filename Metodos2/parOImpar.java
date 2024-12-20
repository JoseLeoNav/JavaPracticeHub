package Metodos2;

import java.util.Scanner;

public class par {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero =solicitarNumero();
        boolean par = esPar(numero);
        if (par) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    public static int solicitarNumero() {
        System.out.println("Por favor ingrese un número:");
        Integer numero = null;
        do {
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
