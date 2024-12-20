package SistemaDeGestion;

import SistemaDeGestion.Modelos.Empleados;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleados[] empleados = new Empleados[10];
        Empleados[] empleadosOriginales = new Empleados[10];
        int opcion;

        do {
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Empleados.MostrarTodosLosEmpleados(empleados);
                    break;
                case 2:
                    Empleados nuevoEmpleado = new Empleados();
                    System.out.print("Ingrese el nombre del empleado: ");
                    nuevoEmpleado.setNombre(scanner.nextLine());
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    nuevoEmpleado.setEdad(edad);
                    System.out.print("Ingrese el salario del empleado: ");
                    int salario = scanner.nextInt();
                    scanner.nextLine();
                    nuevoEmpleado.setSalario(salario);
                    System.out.print("Ingrese el departamento del empleado: ");
                    String departamento = scanner.nextLine();
                    nuevoEmpleado.setDepartamento(departamento);
                    empleados[Empleados.getContador() - 1] = nuevoEmpleado;

                    for (int i = 0; i < empleados.length; i++) {
                        if (empleados[i] != null) {
                            empleadosOriginales[i] = new Empleados();
                            empleadosOriginales[i].setNombre(empleados[i].getNombre());
                            empleadosOriginales[i].setEdad(empleados[i].getEdad());
                            empleadosOriginales[i].setSalario(empleados[i].getSalario());
                            empleadosOriginales[i].setDepartamento(empleados[i].getDepartamento());
                        }
                    }

                    System.out.println("Nuevo empleado!");
                    break;
                case 3:
                    System.out.println("Ingrese el atributo a filtrar");
                    String filtro = scanner.nextLine().toLowerCase();
                    System.out.println("Ingrese el valor del filtro");
                    String valorFiltro = scanner.nextLine();
                    switch (filtro) {
                        case "nombre":
                            Empleados.filtrarEmpleados(empleados, valorFiltro, null, null, null, null, null);
                            break;

                        case "edadmin":
                            Empleados.filtrarEmpleados(empleados, null, Integer.parseInt(valorFiltro), null, null, null,
                                    null);
                            break;

                        case "edadmax":
                            Empleados.filtrarEmpleados(empleados, null, null, Integer.parseInt(valorFiltro), null, null,
                                    null);
                            break;

                        case "salariomin":
                            Empleados.filtrarEmpleados(empleados, null, null, null, Integer.parseInt(valorFiltro), null,
                                    null);
                            break;
                        case "salariomax":
                            Empleados.filtrarEmpleados(empleados, null, null, null, null,
                                    Integer.parseInt(valorFiltro), null);
                            break;
                        case "departamento":
                            Empleados.filtrarEmpleados(empleados, null, null, null, null, null, valorFiltro);
                            break;
                        default:
                            System.out.println("Ingrese una opcion válida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Elija el atributo por el cual desea ordenar");
                    String ordenamiento = scanner.nextLine().toLowerCase();
                    Empleados.ordenarEmpleados(empleados, ordenamiento);
                    break;
                case 5:
                    System.out.println("Elija al empleado al que aumentará el sueldo");
                    int indiceIncrementarSalario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el porcentaje de incremento ");
                    int incremento = scanner.nextInt();
                    scanner.nextLine();
                    Empleados.incrementarSalario(empleados[indiceIncrementarSalario - 1], incremento);
                    break;
                case 6:
                    for (int i = 0; i < empleados.length; i++) {
                        if (empleadosOriginales[i] != null) {
                            empleados[i] = new Empleados();
                            empleados[i].setNombre(empleadosOriginales[i].getNombre());
                            empleados[i].setEdad(empleadosOriginales[i].getEdad());
                            empleados[i].setSalario(empleadosOriginales[i].getSalario());
                            empleados[i].setDepartamento(empleadosOriginales[i].getDepartamento());
                        } else {
                            empleados[i] = null;
                        }
                    }
                    System.out.println("Filtros limpiados. Empleados restaurados al estado original.");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
