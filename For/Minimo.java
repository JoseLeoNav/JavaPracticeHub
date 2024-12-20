package For;

public class Minimo {
    public static void main(String[] args) {
        int[] numeros  = {13,23,2,3245,89};
        int minimo =numeros[0];
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]<minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El elemento de menor valor del array es: " +minimo);
    }
}
