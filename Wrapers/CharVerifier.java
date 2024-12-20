package Wrapers;

import java.util.Scanner;

public class CharVerifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String text = scanner.nextLine();
        int contador =0;
        for(int i = 0; i<text.length(); i++ ){
            char caracter =text.charAt(i);
            if (Character.isLetter(caracter)){
                contador++;
            }
        }
        if(contador == text.length()){
            System.out.println("La cadena solo contiene letras.");
        } else{
            System.out.println("La cadena no contiene solo letras.");
        }
        scanner.close();
    }
    
}
