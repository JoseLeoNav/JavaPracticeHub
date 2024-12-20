package Modelos;

public class Triangulo {
    private int base;
    private int alto;

    public Triangulo(int base, int alto) {
        this.base = base;
        this.alto = alto;
    }

    public Triangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int area() {
        return ((base * alto)/2);
    }
    public void imprimir() {
        System.out.println("Base = " + getBase());
        System.out.println("Altura = " + getAlto());
        System.out.println("Área = " + area());
    }

    
}
