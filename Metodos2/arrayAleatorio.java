package Metodos2;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un el tamaño del array: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese un número máximo:");
        int numeroMaximo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese un número mínimo:");
        int numeroMinimo = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("Su array : " + Arrays.toString(generarArrayAleatorio(numero, numeroMaximo, numeroMinimo)));

    }

    public static int generarAleatorio(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo + 1)) + numeroMinimo;
    }
    
    public static int[] generarArrayAleatorio(int numero, int numeroMaximo, int numeroMinimo) {
        int[] array = new int[numero];
        for (int i = 0; i < numero; i++) {
            array[i] = generarAleatorio(numeroMinimo , numeroMaximo);
        }
        return array;
        
    }
}
