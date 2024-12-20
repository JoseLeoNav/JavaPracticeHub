package Modelos;

public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public int getradio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int area() {
        return (int)(Math.PI * Math.pow(radio, 2));
    }

    public int perimetro() {
        return (int) (2 * Math.PI * radio);
    }
    

    public void imprimir() {
        System.out.println("Radio = " + getradio());
        System.out.println("Perimetro = " + perimetro());
        System.out.println("Área = " + area());
    }

    
}
