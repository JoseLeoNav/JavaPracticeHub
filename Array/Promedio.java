package Array;

import java.util.Scanner;

public class Promedio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[4];
        System.out.print("Ingrese el primer elemento del array: ");
        array[0] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo elemento: ");
        array[1] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tercer elemento: ");
        array[2] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el cuarto elemento: ");
        array[3] =scanner.nextInt();
        scanner.nextLine();
        int suma =array[0]+array[1]+array[2]+array[3];
        int Promedio = suma/array.length;
        System.out.print("El promedio de los cuatro elementos del array es: " + Promedio);
        scanner.close();
    }
}
