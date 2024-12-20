package Metodos;

import java.util.Scanner;

public class tablaDeMultiplicar {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = obtenerNumero();
        imprimirTablasMultiplicar(numero);
    }

    public static int obtenerNumero() {
        System.out.print("Ingrese un número entero: ");
        return scanner.nextInt();
    }

    public static void imprimirTablasMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            int multiplicacion = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacion);
        }
    }
}
