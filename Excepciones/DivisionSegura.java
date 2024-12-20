import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();
        scanner.nextLine();
        try {
            obtenerDenominador(denominador);
            System.out.println("El resultado de la división es " + numerador / denominador);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    public static void obtenerDenominador(int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("El denominador no puede ser cero.");
        }
    }
}
