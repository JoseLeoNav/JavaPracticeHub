package SistemaDeGestion.Modelos;

import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private int edad;
    private int salario;
    private String departamento;
    static int contador = 0;


    public Empleados() {
        contador++;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public static int getContador() {
        return contador;
    }

    public static void MostrarTodosLosEmpleados(Empleados[] empleados) {
        System.out.println("\n+-----------------+----------+-----------+---------------+");
        System.out.println("| No. |    Nombre    |   Edad   |   Salario   | Departamento |");
        System.out.println("+-----------------+----------+-----------+---------------+");

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.format("| %-3d | %-12s | %-8d | %-12d | %-12s |\n", i + 1, empleados[i].getNombre(),
                        empleados[i].getEdad(), empleados[i].getSalario(), empleados[i].getDepartamento());
            }
        }

        System.out.println("+-----------------+----------+-----------+---------------+");
    }

    public static Empleados[] filtrarEmpleados(Empleados[] empleados, String nombre, Integer edadMin, Integer edadMax,
            Integer salarioMin, Integer salarioMax, String departamento) {
        ArrayList<Empleados> empleadosFiltrados = new ArrayList<>();

        for (Empleados empleado : empleados) {
            boolean coincide = true;

            if (nombre != null && !empleado.getNombre().equalsIgnoreCase(nombre)) {
                coincide = false;
            }

            if (edadMin != null && empleado.getEdad() < edadMin) {
                coincide = false;
            }

            if (edadMax != null && empleado.getEdad() > edadMax) {
                coincide = false;
            }

            if (salarioMin != null && empleado.getSalario() < salarioMin) {
                coincide = false;
            }

            if (salarioMax != null && empleado.getSalario() > salarioMax) {
                coincide = false;
            }

            if (departamento != null && !empleado.getDepartamento().equalsIgnoreCase(departamento)) {
                coincide = false;
            }

            if (coincide) {
                empleadosFiltrados.add(empleado);
            }
        }

        return empleadosFiltrados.toArray(new Empleados[0]);
    }

    public static Empleados[] ordenarEmpleados(Empleados[] empleados, String atributo) {
        int n = empleados.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean swap = false;

                switch (atributo) {
                    case "nombre":
                        swap = empleados[j].getNombre().compareToIgnoreCase(empleados[j + 1].getNombre()) > 0;
                        break;
                    case "edad":
                        swap = empleados[j].getEdad() > empleados[j + 1].getEdad();
                        break;
                    case "salario":
                        swap = empleados[j].getSalario() > empleados[j + 1].getSalario();
                        break;
                    case "departamento":
                        swap = empleados[j].getDepartamento()
                                .compareToIgnoreCase(empleados[j + 1].getDepartamento()) > 0;
                        break;
                }

                if (swap) {
                    Empleados temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }

        return empleados;
    }


    public static Empleados incrementarSalario(Empleados empleado, int porcentajeIncremento) {
        double nuevoSalario = empleado.getSalario() * (1 + porcentajeIncremento / 100);
        empleado.setSalario((int) nuevoSalario);
        return empleado;
    }

}
