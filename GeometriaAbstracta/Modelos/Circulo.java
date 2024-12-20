package GeometriaAbstracta.Modelos;

public class Circulo extends Figura implements Dibujable {
    int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        int area = (int) (Math.PI * Math.pow(radio, 2));
        System.out.println("El área del circulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = (int) (2 * Math.PI * radio);
        System.out.println("El perímetro del circulo es: " + perimetro);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo...");
    }

}
