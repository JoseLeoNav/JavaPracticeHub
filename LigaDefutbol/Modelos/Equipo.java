package LigaDefutbol.Modelos;

public class Equipo {

    private String nombre;
    static int contadorEquipos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        contadorEquipos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    public static void tablaEquipos(Equipo[] equipos) {
        System.out.println("Tabla de Equipos");
        System.out.printf("%-5s %-25s%n", "#", "Nombre");
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null) {
                System.out.printf("%-5d %-25s%n", i + 1, equipos[i].getNombre());
            } else {
                System.out.printf("%-5d %-25s%n", i + 1, "Sin nombre");
            }
        }
    }

    public static void eliminarEquipo(Equipo[] equipos, int index) {

        if (index < 0 || index >= equipos.length) {
            System.out.println("Índice fuera de rango. No se puede eliminar el equipo.");
            return;
        }

        if (equipos[index] != null) {
            equipos[index] = null;
            contadorEquipos--;
            System.out.println("Equipo eliminado exitosamente.");
        } else {
            System.out.println("No hay equipo en la posición indicada.");
        }
    }

}
