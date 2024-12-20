package String;

import java.util.Scanner;

public class mayusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.println("A que desea transformar su texto:");
        System.out.println("Opción 1: Mayúsculas");
        System.out.println("Opción 2: Minúsculas");
        System.out.print("Seleccione un número: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1->System.out.println("Su nuevo texto es: " +(texto.toUpperCase()));
            case 2->System.out.println("Su nuevo texto es: " +(texto.toLowerCase()));
            default->System.out.println("Error");
        }
        scanner.close();
    }

}
