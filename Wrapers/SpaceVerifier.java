package Wrapers;

import java.util.Scanner;

public class SpaceVerifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String text = scanner.nextLine();
        int EspaciosContador =0;
        for(int i = 0; i<text.length(); i++ ){
            char caracter =text.charAt(i);
            if (Character.isWhitespace(caracter)){
                EspaciosContador++;
            }
        }
        System.out.println("El número de espacios en blanco es: " +EspaciosContador);
        scanner.close();
    }
    
}
