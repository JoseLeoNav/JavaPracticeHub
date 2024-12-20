package MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Copyof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            double random = Math.random();
            int numero = (int) Math.floor(random * 100) + 1;
            array[i] = numero;
        }
        System.out.println("Este es su array: " +Arrays.toString(array));
        System.out.print("Seleccione un índice inferior: ");
        int inferior = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Seleccione un índice superior: ");
        int superior = scanner.nextInt();
        scanner.nextLine();
        if(superior>inferior){
            System.out.println("El nuevo array es: " +Arrays.toString(Arrays.copyOfRange(array, inferior, superior)) );
        } else {
            System.out.println("Error");
        }
        scanner.close();
    }
}
