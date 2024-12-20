package Metodos2;

import java.util.Scanner;

public class contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();
        scanner.close();
        boolean esSegura = eSegura(contraseña);
        if (esSegura) {
            System.out.println("La contraseña es segura");
            
        } else {
            System.out.println("La contraseña no es segura");
        }

    }

    public static boolean eSegura(String contraseña) {
        return tieneLongitudCorrecta(contraseña) && tieneMayuscula(contraseña) && tieneMinuscula(contraseña)
                && tieneNumero(contraseña) && tieneCaracterEspecial(contraseña);
    }

    public static boolean tieneLongitudCorrecta(String contraseña) {
        return contraseña.length() >= 8;
    }

    public static boolean tieneMayuscula(String contraseña) {
        char[] arrayContraseña = contraseña.toCharArray();
        int contador = 0;
        for (int i = 0; i < arrayContraseña.length; i++) {
            if (Character.isUpperCase(arrayContraseña[i])) {
                contador++;
            }
        }
        return contador >= 1;
    }

    public static boolean tieneMinuscula(String contraseña) {
        char[] arrayContraseña = contraseña.toCharArray();
        int contador = 0;
        for (int i = 0; i < arrayContraseña.length; i++) {
            if (Character.isLowerCase(arrayContraseña[i])) {
                contador++;
            }
        }
        return contador >= 1;
    }

    public static boolean tieneNumero(String contraseña) {
        char[] arrayContraseña = contraseña.toCharArray();
        int contador = 0;
        for (int i = 0; i < arrayContraseña.length; i++) {
            if (Character.isDigit(arrayContraseña[i])) {
                contador++;
            }
        }
        return contador >= 1;
    }

    public static boolean tieneCaracterEspecial(String contraseña) {
        char[] arrayContraseña = contraseña.toCharArray();
        int contador = 0;
        for (int i = 0; i < arrayContraseña.length; i++) {
            if (!Character.isLetterOrDigit(arrayContraseña[i]) && !Character.isWhitespace(arrayContraseña[i])) {
                contador++;
            }
        }
        return contador >= 1;
    }
}
