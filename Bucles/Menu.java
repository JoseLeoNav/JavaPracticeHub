package Bucles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion != 5) {
            System.out.println("Elija una opción: ");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realiza devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            
            if (scaner.hasNextInt()) {
                opcion = scaner.nextInt();
                scaner.nextLine();
                String mensaje = switch (opcion) {
                    case 1 -> "Uds. ha elegido comprar un producto";      
                    case 2 -> "Uds. ha elegido realizar un devolución";  
                    case 3 -> "Uds. ha elegido ver sus pedidos";  
                    case 4 -> "Uds. ha elegido leer preguntas frecuentes";  
                    case 5 -> "Uds. ha salido";
                    default -> "Opción no válida, por favor elija nuevamente.";
                };
                System.out.println(mensaje);
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scaner.next();
            }
        }
        scaner.close();
    }
}
