package Array;


import java.util.Arrays;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];
        System.out.println("Escriba un nombre: ");
        String nombre1 = scanner.nextLine();
        nombres[0] = nombre1;
        System.out.println("Escriba otro nombre: ");
        String nombre2 = scanner.nextLine();
        nombres[1] = nombre2;
        System.out.println("Escriba otro nombre: ");
        String nombre3 = scanner.nextLine();
        nombres[2] = nombre3;
        System.out.println("Escriba otro nombre: ");
        String nombre4 = scanner.nextLine();
        nombres[3] = nombre4;
        Arrays.sort(nombres);
        System.out.println("nombres ordenados alfabeticamente: "+ Arrays.toString(nombres));
        scanner.close();
    }
}