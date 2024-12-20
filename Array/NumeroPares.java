package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NumeroPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
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
        int random6 = (int) Math.floor(Math.random() * 100) + 1;
        array[5] = random6;
        boolean condicion1 = (array[0] % 2) == 0;
        boolean condicion2 = (array[1] % 2) == 0;
        boolean condicion3 = (array[2] % 2) == 0;
        boolean condicion4 = (array[3] % 2) == 0;
        boolean condicion5 = (array[4] % 2) == 0;
        boolean condicion6 = (array[5] % 2) == 0;
        int contador = 0;
        if (condicion1) {
            contador++;
        }
        if (condicion2) {
            contador++;
        }
        if (condicion3) {
            contador++;
        }
        if (condicion4) {
            contador++;
        }
        if (condicion5) {
            contador++;
        }
        if (condicion6) {
            contador++;
        }
        System.out.println("La cantidad de números pares en el array " + Arrays.toString(array) + " es " + contador);

        scanner.close();
    }

}
