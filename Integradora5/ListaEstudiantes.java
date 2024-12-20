package Integradora5;

import java.util.Arrays;
import java.util.Scanner;

public class ListaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresar el número de estudiantes, sus nombres y calificaciones:");
            System.out.print("Número de estudiantes: ");
            int cantidadEstudiantes = scanner.nextInt();
            scanner.nextLine();

            String[] listaEstudiantes = new String[cantidadEstudiantes];
            double[] listaCalificaciones = new double[cantidadEstudiantes];

            for (int i = 0; i < listaEstudiantes.length; i++) {
                System.out.println("Nombre del estudiante " + (i + 1) + ":");
                listaEstudiantes[i] = scanner.nextLine();

                double nota = 0.0;
                boolean condicionNegacionNota;
                do {
                    System.out.print("Calificación: ");
                    nota = scanner.nextDouble();
                    scanner.nextLine();

                    condicionNegacionNota = nota <= 0.00 || nota > 10.00;
                    if (condicionNegacionNota) {
                        System.out.println("Por favor ingrese una calificación válida");
                    }
                } while (condicionNegacionNota);

                listaCalificaciones[i] = nota;
            }

            int opcion = 0;
            while (opcion != 7) {
                System.out.println("Seleccione una opción: ");
                System.out.println("1.- Registrar alumno");
                System.out.println("2.- Mostrar todos los alumnos");
                System.out.println("3.- Mostrar promedio de notas");
                System.out.println("4.- Buscar alumno por nombre");
                System.out.println("5.- Modificar nombre por nota");
                System.out.println("6.- Eliminar alumno por nombre");
                System.out.println("7.- Salir");
                System.out.print("Escriba su elección: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        String[] listaEstudiantes2 = Arrays.copyOf(listaEstudiantes, listaEstudiantes.length + 1);
                        double[] listaCalificaciones2 = Arrays.copyOf(listaCalificaciones,
                                listaCalificaciones.length + 1);
                        System.out.println("Nombre: ");
                        listaEstudiantes2[listaEstudiantes2.length - 1] = scanner.nextLine();
                        System.out.print("Calificación: ");
                        listaCalificaciones2[listaCalificaciones2.length - 1] = scanner.nextDouble();
                        scanner.nextLine();
                        listaEstudiantes = listaEstudiantes2;
                        listaCalificaciones = listaCalificaciones2;
                        break;
                    case 2:
                        for (int i = 0; i < listaEstudiantes.length; i++) {
                            System.out.println(listaEstudiantes[i] + " - " + listaCalificaciones[i]);
                        }
                        break;
                    case 3:
                        int sumatoria = 0;
                        for (int i = 0; i < listaCalificaciones.length; i++) {
                            sumatoria += listaCalificaciones[i];
                        }
                        System.out.println("Promedio total = " + sumatoria / listaCalificaciones.length);

                        break;
                    case 4:
                        System.out.println("Ingrese el nombre: ");
                        String alumnoBuscado = scanner.nextLine();
                        int contador = 0;
                        for (int i = 0; i < listaEstudiantes.length; i++) {
                            if (listaEstudiantes[i].toLowerCase().equals(alumnoBuscado.toLowerCase())) {
                                System.out.println(listaEstudiantes[i] + " - " + listaCalificaciones[i]);
                            } else {
                                contador++;
                            }
                        }
                        if (contador == listaEstudiantes.length) {
                            System.out.println("El alumno " + alumnoBuscado + " no existe.");

                        }
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre: ");
                        alumnoBuscado = scanner.nextLine();
                        contador = 0;
                        for (int i = 0; i < listaEstudiantes.length; i++) {
                            if (listaEstudiantes[i].toLowerCase().equals(alumnoBuscado.toLowerCase())) {
                                listaCalificaciones[i] = scanner.nextDouble();
                                scanner.nextLine();
                            } else {
                                contador++;
                            }
                        }
                        if (contador == listaEstudiantes.length) {
                            System.out.println("El alumno " + alumnoBuscado + " no existe.");

                        }
                        break;
                    case 6:
                        System.out.println("Ingrese el nombre: ");
                        String alumnoEliminar = scanner.nextLine();
                        boolean encontrado = false;
                        int indiceEliminar = 0;
                        for (int i = 0; i < listaEstudiantes.length; i++) {
                            if (listaEstudiantes[i].toLowerCase().equals(alumnoEliminar.toLowerCase())) {
                                indiceEliminar = i;
                                encontrado = true;
                                break;
                            }
                        }
                    
                        if (encontrado) {
                            for (int i = indiceEliminar; i < listaEstudiantes.length - 1; i++) {
                                listaEstudiantes[i] = listaEstudiantes[i + 1];
                                listaCalificaciones[i] = listaCalificaciones[i + 1];
                            }
                            listaEstudiantes = Arrays.copyOf(listaEstudiantes, listaEstudiantes.length - 1);
                            listaCalificaciones = Arrays.copyOf(listaCalificaciones, listaCalificaciones.length - 1);
                    
                            System.out.println("El estudiante " + alumnoEliminar + " ha sido eliminado.");
                        } else {
                            System.out.println("El estudiante " + alumnoEliminar + " no existe.");
                        }
                        break;
                    case 7:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        } finally {
            scanner.close();
        }
    }
}
