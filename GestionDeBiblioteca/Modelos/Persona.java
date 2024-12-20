package GestionDeBiblioteca.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private List<Libro> librosPrestados;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPrestados = new ArrayList<>(); // Inicializar la lista de libros prestados
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    // Método para prestar un libro
    public void prestarLibro(Libro libro) {
        if (!libro.isPrestado()) {
            libro.prestar(); // Cambia el estado del libro a prestado
            librosPrestados.add(libro); // Añadir el libro a la lista de libros prestados
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + nombre + " " + apellido);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
        }
    }

    // Método para devolver un libro
    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver(); // Cambia el estado del libro a no prestado
            librosPrestados.remove(libro); // Eliminar el libro de la lista de libros prestados
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + nombre + " " + apellido);
        } else {
            System.out.println(nombre + " " + apellido + " no tiene el libro '" + libro.getTitulo() + "' prestado.");
        }
    }

    // Método para mostrar la lista de libros prestados
    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " " + apellido + " no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados por " + nombre + " " + apellido + ":");
            for (Libro libro : librosPrestados) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}
