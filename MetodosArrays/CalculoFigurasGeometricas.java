package MetodosArrays;

import java.util.Scanner;

public class CalculoFigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Paralelogramo");
        int opcionFigura = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Seleccione lo que desea calcular:");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");
        int opcionCalculo = scanner.nextInt();
        scanner.nextLine();

        switch (opcionFigura) {
            case 1: 
                if (opcionCalculo == 1) {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Perímetro del círculo: " + calcularPerimetroCirculo(radio));
                } else if (opcionCalculo == 2) {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + calcularAreaCirculo(radio));
                } else {
                    System.out.println("Opción no válida.");
                }
                break;

            case 2: 
                if (opcionCalculo == 1) {
                    System.out.print("Ingrese el lado a del triángulo: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el lado b del triángulo: ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingrese el lado c del triángulo: ");
                    double c = scanner.nextDouble();
                    System.out.println("Perímetro del triángulo: " + calcularPerimetroTriangulo(a, b, c));
                } else if (opcionCalculo == 2) {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + calcularAreaTriangulo(base, altura));
                } else {
                    System.out.println("Opción no válida.");
                }
                break;

            case 3:
                if (opcionCalculo == 1) {
                    System.out.print("Ingrese el lado a del paralelogramo: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el lado b del paralelogramo: ");
                    double b = scanner.nextDouble();
                    System.out.println("Perímetro del paralelogramo: " + calcularPerimetroParalelogramo(a, b));
                } else if (opcionCalculo == 2) {
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del paralelogramo: " + calcularAreaParalelogramo(base, altura));
                } else {
                    System.out.println("Opción no válida.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetroTriangulo(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroParalelogramo(double a, double b) {
        return 2 * (a + b);
    }

    public static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
}
