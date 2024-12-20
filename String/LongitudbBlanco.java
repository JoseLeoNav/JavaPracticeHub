package String;

import java.util.Scanner;

public class LongitudbBlanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        String textoSinEspacios = texto.replace(" ","");
        int longitud = textoSinEspacios.length();
        System.out.println("La longitud del texto sin contar los espacios en blanco es: " + longitud);
        scanner.close();
    }
}
 