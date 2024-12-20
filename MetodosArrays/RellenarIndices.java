package MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarIndices {

    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Escriba el tamaño del array: ");
        int tamanoArray = scanner.nextInt();
        int[] array = new int[tamanoArray];
        completarArray(array);
        scanner.close();
    }
    public static void completarArray(int[] array) {
        System.out.print("Con qué elemento completarás el array: ");
        int elemento = scanner.nextInt();
        System.out.print("Ingrese el índice hasta el que completar: ");
        int indice1 = scanner.nextInt();

        if (indice1 >= array.length || indice1 < 0) {
            System.out.println("Índice no válido");
            scanner.close();
            return;
        }

        for (int i = 0; i <= indice1; i++) {
            array[i] = elemento;
        }

        while (indice1 != array.length - 1) {
            System.out.print("Con qué otro número desea completar el array: ");
            elemento = scanner.nextInt();
            System.out.print("Hasta qué índice desea hacerlo: ");
            int indice2 = scanner.nextInt();

            if (indice2 <= indice1 || indice2 >= array.length) {
                System.out.println("Ingrese un índice válido");
            } else {
                for (int  i= indice1 + 1; i <= indice2; i++) {
                    array[i] = elemento;
                }
                indice1 = indice2;
            }
        }

        System.out.println("Este es su array: " + Arrays.toString(array));
        
    }
}
