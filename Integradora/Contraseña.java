package Integradora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        List<String> errores = new ArrayList<>();

        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;
        int contadorEspeciales = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char ch = contraseña.charAt(i);
            if (Character.isUpperCase(ch)) {
                contadorMayusculas++;
            }
            if (Character.isLowerCase(ch)) {
                contadorMinusculas++;
            }
            if (Character.isDigit(ch)) {
                contadorNumeros++;
            }
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                contadorEspeciales++;
            }
        }

        if (contadorMayusculas < 1) {
            errores.add("La contraseña debe contener al menos una letra mayúscula.");
        }
        if (contadorMinusculas < 1) {
            errores.add("La contraseña debe contener al menos una letra minúscula.");
        }
        if (contadorNumeros < 1) {
            errores.add("La contraseña debe contener al menos un número.");
        }
        if (contadorEspeciales < 1) {
            errores.add("La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");
        }

        if (errores.isEmpty()) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Errores encontrados:");
            for (String error : errores) {
                System.out.println(error);
            }
        }

        scanner.close();
    }
}
