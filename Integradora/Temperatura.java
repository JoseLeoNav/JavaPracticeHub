package Integradora;

import java.util.Scanner;

public class Temperatura {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int medida = 0;
        try {
            System.out.print("Ingrese la temperatura: ");
            medida = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
            return;
        }

        System.out.print("Ingrese la unidad de medida (C/F): ");
        String temperatura = scanner.nextLine();
        String toUpper = temperatura.toUpperCase();
        switch (toUpper) {
            case "C":
                System.out.println(
                        medida + " grados Celsius equivalen a " + ((medida * 9 / 5) + 32) + " grados Fahrenheit.");
                break;
            case "F":
                System.out.println(
                        medida + " grados Fahrenheit equivalen a " + ((medida - 32) * 5 / 9) + " grados Celsius.");
                break;
            default:
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                break;
        }

        scanner.close();
    }
}
