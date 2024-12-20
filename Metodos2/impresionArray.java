package Metodos2;

import java.util.Arrays;


public class impresionArray {


    public static void main(String[] args) {
        String[] arregloUnidimensional = {"Elemento1","Elemento2","Elemento3"};
        int[][] arregloBidimensionalInt = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        String[][] arregloBidimensionalString = {
            {"A1", "A2", "A3"},
            {"B1", "B2", "B3"},
            {"C1", "C2", "C3"}
        };

        imprimirArray(arregloUnidimensional, arregloBidimensionalInt, arregloBidimensionalString);

    }

    public static void imprimirArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void imprimirArray(String[] array, int[][] array1, String[][] array2) {
        System.out.println("Arreglo Unidimensional:");
        imprimirArray(array);

        System.out.println("Arreglo Bidimensional int:");
        for (int[] fila : array1) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Arreglo Bidimensional String:");
        for (String[] fila : array2) {
            System.out.println(Arrays.toString(fila));
        }
    }
}

