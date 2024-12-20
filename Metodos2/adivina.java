package Metodos2;

import java.util.Scanner;

public class adivina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número máximo:");
        int numeroMaximo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese un número mínimo:");
        int numeroMinimo = scanner.nextInt();
        scanner.nextLine();
        int aleatorio = generarAleatorio(numeroMinimo, numeroMaximo);
        boolean adivino = false;
        while (!adivino) {
            System.out.print("Adivina el número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); 
            if (numero == aleatorio) {
                adivino = true;
                System.out.println("¡Felicidades! Adivinaste el número.");
            } else if (numero < aleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
        scanner.close();

    }

    public static int generarAleatorio(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo + 1)) + numeroMinimo;
    }
}
