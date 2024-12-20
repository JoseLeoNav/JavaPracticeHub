package GestionDeBiblioteca.Modelos;

public class Libro extends ItemBiblioteca implements Catalogable {

    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean prestado; // Atributo para rastrear si el libro está prestado

    // Constructor
    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado = false; // Inicialmente, el libro no está prestado
    }

    // Métodos getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    private void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public double calcularMultas() {
        return 0.0;
    }

    @Override
    public void devolver() {
        if (prestado) {
            setPrestado(false);
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    @Override
    public void prestar() {
        if (!prestado) {
            setPrestado(true);
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    @Override
    public String obtenerInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroDePaginas + ", Prestado: " + (prestado ? "Sí" : "No");
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getNumeroDePaginas());
        System.out.println("Prestado: " + (isPrestado() ? "Sí" : "No"));
    }
}
