package GestionDeBiblioteca.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributo para almacenar los libros en la biblioteca
    private List<Catalogable> catalogo;

    // Constructor
    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    // Método para agregar un libro al catálogo
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado al catálogo.");
    }

    // Método para mostrar todos los libros en el catálogo
    public void mostrarCatalogo() {
        System.out.println("Catálogo de libros:");
        for (Catalogable item : catalogo) {
            System.out.println(item.obtenerInformacion());
            System.out.println("---------------------------");
        }
    }

    // Método para buscar un libro por su título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Catalogable item : catalogo) {
            if (item instanceof Libro && ((Libro) item).getTitulo().equalsIgnoreCase(titulo)) {
                return (Libro) item;
            }
        }
        return null; // Si no se encuentra el libro
    }

    // Método para buscar libros por autor
    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosDelAutor = new ArrayList<>();
        for (Catalogable item : catalogo) {
            if (item instanceof Libro && ((Libro) item).getAutor().equalsIgnoreCase(autor)) {
                librosDelAutor.add((Libro) item);
            }
        }
        return librosDelAutor; // Puede devolver una lista vacía si no se encuentran libros
    }

    // Método para prestar un libro a una persona
    public void prestarLibro(String titulo, Persona persona) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null) {
            if (!libro.isPrestado()) {
                persona.prestarLibro(libro); // Marca el libro como prestado y lo añade a la lista de la persona
                System.out.println("El libro '" + titulo + "' ha sido prestado a " + persona.getNombre() + " " + persona.getApellido());
            } else {
                System.out.println("El libro '" + titulo + "' ya está prestado.");
            }
        } else {
            System.out.println("El libro '" + titulo + "' no se encuentra en el catálogo.");
        }
    }

    // Método para devolver un libro por una persona
    public void devolverLibro(String titulo, Persona persona) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null) {
            if (libro.isPrestado() && persona.getLibrosPrestados().contains(libro)) {
                persona.devolverLibro(libro); // Marca el libro como disponible y lo elimina de la lista de la persona
                System.out.println("El libro '" + titulo + "' ha sido devuelto por " + persona.getNombre() + " " + persona.getApellido());
            } else {
                System.out.println("El libro '" + titulo + "' no está prestado a " + persona.getNombre() + " " + persona.getApellido() + ".");
            }
        } else {
            System.out.println("El libro '" + titulo + "' no se encuentra en el catálogo.");
        }
    }
}
