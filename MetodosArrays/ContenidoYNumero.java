package MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContenidoYNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos: ");
        int cifra = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el número para completar: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[cifra];
        Arrays.fill(array, numero);
        System.out.println("Este es su array: " + Arrays.toString(array));
        scanner.close();
    }
    
}
