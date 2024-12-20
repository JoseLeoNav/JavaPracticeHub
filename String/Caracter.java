package String;

import java.util.Scanner;

public class Caracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.print("Ahora ingrese un caracter o grupo de caracteres: ");
        String caracter = scanner.nextLine();
        int position = texto.indexOf(caracter);
        if (position != -1) {
            System.out.println("El caracter se ubica en el indice " + position + " del texto.");
        } else {
            System.out.println("Ese caracter no existe dentro del texto.");
        }
        scanner.close();
    }

}
