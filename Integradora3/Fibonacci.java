package Integradora3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese una posicion: ");
        int posicion = scanner.nextInt();
        scanner.close();
        int numInf = 0;
        int numSup = 1;
        int sumatoria = 0;
        for (int i = 1; i < posicion; i++) {
            sumatoria = numInf + numSup;
            numInf = numSup;
            numSup = sumatoria;
        }
        System.out.println("Posición "+posicion+ ": "+numSup);
    }

}
