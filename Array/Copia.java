package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Copia {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,123,43};
        int nuevaLongitud = array.length+2;
        int[] array1 = Arrays.copyOf(array, nuevaLongitud);
        try{
        System.out.print("Ingrese el cuarto elemento del nuevo array: ");
        array1[3] =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el quinto elemento: ");
        array1[4] =scanner.nextInt();
        scanner.nextLine();
        } catch(Exception e){
            System.out.print("Solo ingrese datos numéricos");
            return;
        }
        System.out.print("Los elementos del nuevo array son: " + Arrays.toString(array1));
        scanner.close();
    }

}
