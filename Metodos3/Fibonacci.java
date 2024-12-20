package Metodos3;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     
        System.out.print("Ingrese la posicion del número: ");
        int valorEnesimo = scanner.nextInt();
        scanner.close();
        int numero = CreadorNumero(valorEnesimo);
        System.out.println("El valor de la posicion " + valorEnesimo+ " es: "+ numero );
    }

    public static int CreadorNumero(int numero){
        if (numero <=1) {
            return numero;
        } 
        return CreadorNumero(numero-1) + CreadorNumero(numero-2);
    }

}
