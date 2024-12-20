package Bucles;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un número");
        int numero = scanner.nextInt();
        scanner.nextLine();
        numero = Math.abs(numero);
        int contador =0;
        if(numero == 0){contador ++;}
        else {
            while (numero>0) {
                numero = numero /10;
                contador++;                
            }
        };
        System.out.println("Su numero de digitos es " +contador);
        scanner.close();
    }
}
