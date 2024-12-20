package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class RectanguloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<rectangulo> rectangulos = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println(" Menú ");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Mostrar área de todos los rectángulos");
            System.out.println("3. Mostrar perímetro de todos los rectángulos");
            System.out.println("4. Mostrar el número de rectángulos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Introduce el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    rectangulo nuevoRectangulo = new rectangulo(ancho, alto);
                    rectangulos.add(nuevoRectangulo);
                    System.out.println("Rectángulo creado con éxito.");
                    break;

                case 2:
                    System.out.println(" Áreas de los rectángulos: ");
                    for (rectangulo rect : rectangulos) {
                        rect.imprimirArea();
                    }
                    break;

                case 3:
                    System.out.println(" Perímetros de los rectángulos: ");
                    for (rectangulo rect : rectangulos) {
                        rect.imprimirPerimetro();
                    }
                    break;

                case 4:
                    if (!rectangulos.isEmpty()) {
                        rectangulo.imprimirNumeroDeRectangulos();
                    } else {
                        System.out.println("No se han creado rectángulos aún.");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}

class rectangulo {
    double ancho;
    double alto;
    static int contadorRectangulo = 0;

    public rectangulo(double ancho, double alto) {
        this.alto = alto;
        this.ancho = ancho;
        contadorRectangulo++;
    }

    public Integer Perimetro() {
        return (int) (2 * (this.ancho + this.alto));
    }

    public Integer Area() {
        return (int) (this.ancho * this.alto);
    }

    public void imprimirArea() {
        System.out.println("El área del rectángulo es: " + Area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + Perimetro());
    }

    public static void imprimirNumeroDeRectangulos() {
        System.out.println("El número de rectángulos es: " + contadorRectangulo);
    }
}
