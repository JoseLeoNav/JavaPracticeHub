package Metodos;
import java.util.Arrays;
import java.util.Scanner;

public class tablaDeMultiplicar2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = obtenerNumeros();
        imprimirTablasMultiplicar(numeros);
    }

    public static int[] obtenerNumeros() {
        System.out.println("Ingrese tres número enteros: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        int numero3 = scanner.nextInt();
        scanner.nextLine();
        return new int[]{numero1, numero2, numero3};
        
    }

    public static void imprimirTablasMultiplicar(int[] numeros) {
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("La tabla de multiplicacion de "+numeros[i]+" es:");
            for( int j = 1; j<=10; j++){
                int multiplicacion = numeros[i] * j;
            System.out.println(numeros[i] + " x " + j + " = " + multiplicacion);
            }
        }
    }
}

    
