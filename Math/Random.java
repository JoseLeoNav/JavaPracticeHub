package Math;

import java.util.Scanner;

public class Ran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el limite inferior: ");
        int inf = scanner.nextInt();
        System.out.print("Ingrese el límite superior ");
        int sup = scanner.nextInt();
        double random = Math.random();
        int numero = ((int)random * (sup-inf))+inf;
        System.out.println("Número aleatorio generado " + "("+inf+ "-" +sup+") : "  + numero);
        scanner.close();
    }
}
