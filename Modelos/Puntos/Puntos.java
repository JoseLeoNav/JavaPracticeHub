package Modelos.Puntos;

public class Puntos {
    private int X;
    private int Y;
    static int contador = 0;

    public int getX() {
        contador++;
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int distanciaDesdeOrigen() {
        return (int) Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    public static int calcularDistancia(Puntos punto1, Puntos punto2) {
        return (int) Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
    }

    public static boolean estanAlineados(Puntos punto1, Puntos punto2, Puntos punto3) {
        return (punto1.getY() - punto2.getY()) / (punto1.getX() - punto2.getX()) == (punto3.getY() - punto1.getY())
                / (punto3.getX() - punto1.getX());
    }

    public void imprimirPunto() {
        System.out.println("(X: " + getX() + ", Y: " + getY() + ")");
    }
}