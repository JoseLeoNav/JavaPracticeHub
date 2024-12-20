package Metodos2;

public class random {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }
    public static int randomNumber() {
        int random = (int) Math.floor(Math.random() * 355) + 1;
        return random;
    }
    
}
