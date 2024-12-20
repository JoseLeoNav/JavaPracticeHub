package For;

import java.util.Arrays;

public class Acumulacion {
    public static void main(String[] args) {
        int[] numeros  = {12,67,97,54,14,42,78};
        for (int i = 1; i < numeros.length; i++) {  
            int suma = numeros[i] + numeros[i - 1];
            numeros[i] = suma;
        }
        System.out.println("El nuevo array de acumulacion es: " + Arrays.toString(numeros));  
    }
}
