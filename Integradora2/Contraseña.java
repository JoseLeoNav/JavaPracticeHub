package Integradora2;

import java.util.Random;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de su contraseña: ");
        int longitud = scanner.nextInt();
        scanner.close();

        char[] contrasena = new char[longitud];
        Random random = new Random();

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        do {
            for (int i = 0; i < longitud; i++) {
                int tipoCaracter = random.nextInt(3);

                switch (tipoCaracter) {
                    case 0:
                        contrasena[i] = (char) (random.nextInt(10) + '0');
                        if (Character.isDigit(contrasena[i])) {
                            tieneDigito = true;
                        }
                        break;
                    case 1:
                        contrasena[i] = (char) (random.nextInt(26) + 'A');
                        if (Character.isUpperCase(contrasena[i])) {
                            tieneMayuscula = true;
                        }
                        break;
                    case 2:
                        contrasena[i] = (char) (random.nextInt(26) + 'a');
                        if (Character.isLowerCase(contrasena[i])) {
                            tieneMinuscula = true;
                        }
                        break;
                }
            }
        } while (!tieneMayuscula || !tieneMinuscula || !tieneDigito);
        StringBuilder contrasenaFinal = new StringBuilder();
        for (char c : contrasena) {
            contrasenaFinal.append(c);
        }
        System.out.println("Contraseña generada: " + contrasenaFinal.toString());
    }
}

