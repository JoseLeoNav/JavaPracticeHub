package Array;

import java.util.Scanner;

public class Suma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[3];
        System.out.print("Ingrese el primer elemento del array: ");
        array[0] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo elemento: ");
        array[1] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tercer elemento: ");
        array[2] =scanner.nextInt();
        scanner.nextLine();
        int suma =array[0]+array[1]+array[2] ;
        System.out.print("La suma de los tres elementos del array es: " + suma);
        scanner.close();
    }
}
