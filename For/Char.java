package For;
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] frase = "Mi primera vez programando en Java y en EGG.".toCharArray();
        System.out.print("porfavor ingrese un caracter: ");
        char caracter = scanner.nextLine().charAt(0);
        int contador =0;
        for(int i =0; i<frase.length; i++){
            if (Character.toLowerCase(caracter) == Character.toLowerCase(frase[i])){
                contador++;
            }
        }
        if (contador == 0) 
        {
            System.out.println("El caracter " +caracter +" no aparece.");   
        } else if (contador == 1) {
            System.out.println("El caracter " +caracter +" aparece " +contador+ " vez.");           
        } else {
            System.out.println("El caracter " +caracter +" aparece " +contador+ " veces.");     
        }
        scanner.close();

    }

}
