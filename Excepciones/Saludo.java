import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            saludar(scanner);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void saludar(Scanner scanner) throws Exception {
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        if (nombre.length() < 2) {
            throw new Exception("El nombre no puede tener menos de 2 caracteres.");
        }
        System.out.println("Hola! " + nombre);
        scanner.close();
    }

}
