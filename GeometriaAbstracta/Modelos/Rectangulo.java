package GeometriaAbstracta.Modelos;

public class Rectangulo extends Figura implements Dibujable {

    int altura;
    int ancho;
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        int area = getAltura() * getAncho();
        System.out.println("El área del rectángulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = 2 * (getAltura() + getAncho());
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo...");
    }
    
    
}
