package Array;

import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
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
        System.out.print("Ingrese el quinto elemento: ");
        array[4] =scanner.nextInt();
        scanner.nextLine();
        int maximo = array[4];
        // int maximo = array[0];
        // for (int i = 1; i < array.length; i++) {
        //     if (array[i] > maximo) {
        //         maximo = array[i];
        //     }
        
        System.out.print("El último elemento del array es: " + maximo);
        scanner.close();
    }
    
}
