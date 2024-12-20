package Integradora3;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas unidades tendrá su cuadrado? : ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i = 1; i <= (n-2); i++){
            System.out.print("*");
            for(int a = 1; a <= (n-2); a++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
}
