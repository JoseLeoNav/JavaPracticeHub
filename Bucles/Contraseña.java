package Bucles;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña = "Secreto";
        System.out.print("Por favor ingrese su contraseña: ");
        String texto = scanner.nextLine();

        while (!texto.equals(contraseña)) {
            System.out.println("Por favor intentelo de nuevo");
            texto = scanner.nextLine();
        }
        System.out.println("Bien hecho.");
        scanner.close();
    }
}
