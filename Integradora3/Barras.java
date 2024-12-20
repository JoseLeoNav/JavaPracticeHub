package Integradora3;

import java.util.Scanner;

public class Barras {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor ingrese 4 números entre el 1 y 20: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            int numero3 = scanner.nextInt();
            int numero4 = scanner.nextInt();
            scanner.close();
            boolean condicion1= 1<=numero1 && numero1<=20;
            boolean condicion2= 1<=numero1 && numero2<=20;
            boolean condicion3= 1<=numero1 && numero3<=20;
            boolean condicion4= 1<=numero1 && numero4<=20;

            if(condicion1&&condicion2&&condicion3&&condicion4){

            System.out.print(""+numero1+":");
            for(int i=1 ;i<=numero1; i++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(""+numero2+":");
            for(int i=1 ;i<=numero2; i++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(""+numero3+":");
            for(int i=1 ;i<=numero3; i++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(""+numero4+":");
            for(int i=1 ;i<=numero4; i++){
                System.out.print("*");
            }
            System.out.println("");
        } else{
            System.out.println("Uno o varios elementos no cumplen con las condiciones requeridas.");
        }
    }
}