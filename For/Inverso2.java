package For;

import java.util.Arrays;

public class Inverso2 {
    public static void main(String[] args) {
        int[] numeros  = {346,123,234,45};
        int[] numeros2 = new int[4];
        for (int i=0; i<numeros.length; i++){
            int condicion = (numeros.length)-i-1;
            numeros2[i] = numeros[condicion];
        }
        System.out.println("El nuevo array de orden inverso es:  "+Arrays.toString(numeros2));
    }
    
}
