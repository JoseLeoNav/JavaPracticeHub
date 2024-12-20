package MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        System.out.println("Escriba los elementos del primer array: ");

        for(int i=0; i<array1.length; i++ ){
            System.out.print("Escriba el elemento de posicion "+ i +" : ");
            array1[i]= scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Escriba los elementos del segundo array: ");
        for(int i=0; i<array2.length; i++ ){
            System.out.print("Escriba el elemento de posicion "+ i +" : ");
            array2[i]= scanner.nextInt();
            scanner.nextLine();
        }
        if(Arrays.equals(array1, array2)){
            System.out.println("Ambos array son iguales");
        } else{ 
            System.out.println("No son arrays iguales");
        }
        scanner.close();
    }
    
}
