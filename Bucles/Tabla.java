package Bucles;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        while (numero != 0) {
            System.out.println("La tabla de multiplicar de " +numero+ " es:");
            System.out.println(" 1 X "+numero+" = "+(numero));
            System.out.println(" 2 X "+numero+" = "+(numero*2)); 
            System.out.println(" 3 X "+numero+" = "+(numero*3)); 
            System.out.println(" 4 X "+numero+" = "+(numero*4)); 
            System.out.println(" 5 X "+numero+" = "+(numero*5));         
            System.out.println(" 6 X "+numero+" = "+(numero*6)); 
            System.out.println(" 7 X "+numero+" = "+(numero*7)); 
            System.out.println(" 8 X "+numero+" = "+(numero*8)); 
            System.out.println(" 9 X "+numero+" = "+(numero*9)); 
            System.out.println(" 10 X "+numero+" = "+(numero*10));
            System.out.print("Ingrese otro número: ");
            numero =scanner.nextInt();
            scanner.nextLine();
            }
            System.out.println("0 no tiene una tabla de multiplicar");
            scanner.close();
    }
    
}
