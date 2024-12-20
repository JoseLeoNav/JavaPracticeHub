package For;

public class Inverso {
    public static void main(String[] args) {
        int[] numeros  = {18,23,34,45};
        System.out.println("El orden inverso del array es: ");
        for (int i=3; i>=0; i--){
            System.out.println("Array["+i+"] = "+numeros[i]);
        }
    }
    
}
