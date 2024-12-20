package Metodos2;

import java.util.Scanner;

public class Notas {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese su nota: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        String nota = obtenerNota(numero);
        System.out.println("La calificación es: " + nota);
    }

    public static String obtenerNota(int numero) {
        return switch (numero / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5, 4, 3, 2, 1, 0 -> "F";
            default -> "Nota inválida";
        };
    }

}
