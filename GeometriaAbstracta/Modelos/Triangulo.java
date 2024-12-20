package GeometriaAbstracta.Modelos;

public class Triangulo extends Figura implements Dibujable {

    int base;
    int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        int area = (getAltura() * getBase()) / 2;
        System.out.println("El área del triangulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        int hipotenusa = (int) Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
        int perimetro = getBase() + getAltura() + hipotenusa;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo...");
    }

}
