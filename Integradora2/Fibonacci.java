package Integradora2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     
        System.out.println("Ingrese el número de sucesiones");
        int valorEnesimo = scanner.nextInt();
        scanner.close();
        int posiciona =0;
        int posicionb=1;
        int suma =0;

        while(posicionb<valorEnesimo){
            suma = posiciona + posicionb;
            posiciona = posicionb;
            posicionb=suma;
        }

        System.out.println("El valor de la posicion " + valorEnesimo+ " es: "+ posicionb);

    }
}
