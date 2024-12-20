package String;

import java.util.Scanner;

public class Replace {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.println("Ingrese un caracter para reemplazar:");
        String caracter = scanner.nextLine();
        System.out.println("Ingrese unc caracter reemplazante:");
        String reemplazo = scanner.nextLine();
        String nuevoTexto = texto.replace(caracter, reemplazo);
        System.out.println("Su nuevo texto es: "+nuevoTexto);
        scanner.close();
    }
}
