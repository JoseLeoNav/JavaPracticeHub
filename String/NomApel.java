package String;

import java.util.Scanner;

public class NomApel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sus nombres: ");
        String nom = scanner.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        String ape = scanner.nextLine();
        System.out.println("Su nombre completo es: " + nom.concat(" ").concat(ape));
        scanner.close();
    }

}
