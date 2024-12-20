package MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor((Math.random() * 100) + 1);
        }

        System.out.println("Este es el array original: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();
        int indice = Arrays.binarySearch(array, valorBuscado);
        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El valor " + valorBuscado + " no está presente en el arreglo.");
        }

        scanner.close();
    }
}
