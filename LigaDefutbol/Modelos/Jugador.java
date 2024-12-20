package LigaDefutbol.Modelos;

public class Jugador {
    private String nombre;
    private Equipo equipo;
    static int contadorJugadores;

    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        contadorJugadores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    public static void tablaJugadores(Jugador[] jugadores) {
        System.out.println("Tabla de Jugadores:");
        System.out.printf("%-5s %-25s %-25s\n", "#", "Nombre", "Equipo");
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                String nombreEquipo = jugadores[i].getEquipo() != null ? jugadores[i].getEquipo().getNombre() : "";
                System.out.printf("%-5d %-25s %-25s\n", i + 1, jugadores[i].getNombre(), nombreEquipo);
            } else {
                System.out.printf("%-5d %-25s %-25s\n", i + 1, "Sin nombre", "Sin equipo");
            }
        }
    }

    public static void eliminarJugador(Jugador[] jugadores, int index) {
        if (index < 0 || index >= jugadores.length) {
            System.out.println("Índice fuera de rango. No se puede eliminar el jugador.");
            return;
        }
        if (jugadores[index] != null) {
            jugadores[index] = null; 
            contadorJugadores--;
            System.out.println("Jugador eliminado exitosamente.");
        } else {
            System.out.println("No hay jugador en la posición indicada.");
        }

    }
    

}
