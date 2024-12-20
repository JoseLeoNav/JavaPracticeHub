package Modelos;

public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int area() {
        return ancho * alto;
    }

    public int perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimir() {
        System.out.println("Ancho = " + getAncho());
        System.out.println("Altura = " + getAlto());
        System.out.println("Perimetro = " + perimetro());
        System.out.println("Área = " + area());
    }

}
