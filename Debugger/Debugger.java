package Debugger;

public class Debugger {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }

}