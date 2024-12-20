package GestionDeBiblioteca;

import GestionDeBiblioteca.Modelos.Biblioteca;
import GestionDeBiblioteca.Modelos.Libro;
import GestionDeBiblioteca.Modelos.Persona;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Persona para simular un usuario de la biblioteca
        Persona persona = new Persona("Juan", "Pérez");

        while (true) {
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar un libro al catálogo");
            System.out.println("2. Mostrar información de los libros en el catálogo");
            System.out.println("3. Prestar un libro");
            System.out.println("4. Devolver un libro");
            System.out.println("5. Mostrar libros prestados por la persona");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    agregarLibro(biblioteca, scanner);
                    break;
                case 2:
                    biblioteca.mostrarCatalogo();
                    break;
                case 3:
                    prestarLibro(biblioteca, persona, scanner);
                    break;
                case 4:
                    devolverLibro(biblioteca, persona, scanner);
                    break;
                case 5:
                    persona.mostrarLibrosPrestados();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    // Método para agregar un libro al catálogo de la biblioteca
    private static void agregarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        int numeroDePaginas = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        // Crear un nuevo objeto Libro y agregarlo a la biblioteca
        Libro libro = new Libro(titulo, autor, numeroDePaginas);
        biblioteca.agregarLibro(libro);
        System.out.println("El libro '" + titulo + "' ha sido agregado al catálogo.");
    }

    // Método para prestar un libro de la biblioteca a una persona
    private static void prestarLibro(Biblioteca biblioteca, Persona persona, Scanner scanner) {
        System.out.print("Ingrese el título del libro que desea prestar: ");
        String titulo = scanner.nextLine();

        biblioteca.prestarLibro(titulo, persona);
    }

    // Método para devolver un libro a la biblioteca por una persona
    private static void devolverLibro(Biblioteca biblioteca, Persona persona, Scanner scanner) {
        System.out.print("Ingrese el título del libro que desea devolver: ");
        String titulo = scanner.nextLine();

        biblioteca.devolverLibro(titulo, persona);
    }
}
