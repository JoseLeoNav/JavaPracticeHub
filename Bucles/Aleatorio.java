package Bucles;

import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double random = Math.random();
        int cantidad = (int) Math.floor(random * 20) + 1;
        int numero= 0;
        do{
            System.out.println("Ingrese un número mayor que: " +cantidad);
            numero = scanner.nextInt();
            scanner.nextLine();
            if (numero< cantidad) {
                System.out.println("Inténtelo otra vez.");        
            } else if (numero>cantidad){
                System.out.println("Bien hecho.");
            }
            } while(numero<cantidad);
            scanner.close();
    }

}
