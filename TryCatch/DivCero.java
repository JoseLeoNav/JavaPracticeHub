package TryCatch;

import java.util.Scanner;

public class DivCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero entero: ");
            int num1 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese otro: ");
            int num2 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("No puede existir una división con divisor 0.");
        } catch (Exception e) {
            System.out.println("Error: ");
        } finally {
            scanner.close();
        }
    }
}
