package Array;

import java.util.Arrays;

public class SumaPosicionPar {
    public static void main(String[] args) {
        int[] array = new int[5];
        int random1 = (int) Math.floor(Math.random() * 100) + 1;
        array[0] = random1;
        int random2 = (int) Math.floor(Math.random() * 100) + 1;
        array[1] = random2;
        int random3 = (int) Math.floor(Math.random() * 100) + 1;
        array[2] = random3;
        int random4 = (int) Math.floor(Math.random() * 100) + 1;
        array[3] = random4;
        int random5 = (int) Math.floor(Math.random() * 100) + 1;
        array[4] = random5;
        int suma  = array[0] + array[2] +array[4];
        System.out.println("La suma de los elementos en las posiciones pares del array: " + Arrays.toString(array)+ " es "+suma);
    }
}
