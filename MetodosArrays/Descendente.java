package MetodosArrays;

import java.util.Arrays;

public class Descendente {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            double random = Math.random();
            int numero = (int) Math.floor(random * 100) + 1;
            array[i] = numero;
        }
        System.out.println("Este es el array: " +Arrays.toString(array));
        Arrays.sort(array);
        int[] reverse = new int[10];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        System.out.println("Array ordenado inversamente: " +Arrays.toString(reverse));

    }

    
}
