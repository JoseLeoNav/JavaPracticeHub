package Array;

import java.util.Scanner;

public class BuscarElemento {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int numero = 0;
        try {
            System.out.print("Ingrese el primer elemento del array: ");
            array[0] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el segundo elemento: ");
            array[1] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el tercer elemento: ");
            array[2] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.print("Solo ingrese números");
            return;
        }
        boolean condicion = array[0] == numero || array[1] == numero || array[2] == numero;
        if (condicion) {
            System.out.print("El número " + numero + " existe en el array.");
        } else {
            System.out.print("El número " + numero + " no se encuentra en el array.");
        }
        scanner.close();
    }
}
