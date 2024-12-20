package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Sopa {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        leerValores(numeros);
        mostrarResultados(numeros, calcularSuma(numeros), calcularPromedio(numeros));
    }

    public static void leerValores(ArrayList<Integer> array) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese los números que desee:");
            numero = scanner.nextInt();
            scanner.nextLine();
            array.add(numero);
        } while (numero != -99);
        scanner.close();

    }

    public static int calcularSuma(ArrayList<Integer> array) {
        int suma = 0;
        for (int a : array) {
            suma += a;
        }
        return suma;
    }

    public static int calcularPromedio(ArrayList<Integer> array) {
        int suma = calcularSuma(array);
        return suma / array.size();
    }

    public static void mostrarResultados(ArrayList<Integer> array, int suma, int media) {
        System.out.println("Los valores del array son:");
        System.out.println("");
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("");
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("");
        System.out.println("La media aritmetica de los valores es: " + media);
        System.out.println("");
        int contador = 0;
        for (int a : array) {
            if (a > media) {
                contador++;
            }
        }
        System.out.println("La cantidad de valores mayores que la media es: " + contador);

    }
}
