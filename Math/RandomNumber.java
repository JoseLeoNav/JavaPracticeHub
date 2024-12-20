package Math;

public class RandomNumber {
    public static void main(String[] args) {

        double random = Math.random();

        int numero = (int) Math.floor(random * 355) + 1;

        System.out.println("Numero aleatorio generado (1-355): " + numero);
    }
}
