package GeometriaAbstracta;

import GeometriaAbstracta.Modelos.Rectangulo;
import GeometriaAbstracta.Modelos.Circulo;
import GeometriaAbstracta.Modelos.Triangulo;

public class App {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(5);
        rectangulo.setAncho(3);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        Circulo circulo = new Circulo();
        circulo.setRadio(2);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(3);
        triangulo.setAltura(4);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}