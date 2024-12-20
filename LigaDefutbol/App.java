package LigaDefutbol;

import java.util.Scanner;

import LigaDefutbol.Modelos.Jugador;
import LigaDefutbol.Modelos.Equipo;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[10];
        Equipo[] equipos = new Equipo[10];
        int opcion = 0;
        do {
            System.out.println("------------------Menu----------------");
            System.out.println("1. Crear jugadpr");
            System.out.println("2. Crear equipo");
            System.out.println("3. Asignar jugador a equipo");
            System.out.println("4. Mostrar lista de jugadores");
            System.out.println("5. Mostrar lista de equipos");
            System.out.println("6. Eliminar jugador");
            System.out.println("7. Eliminar equipo");
            System.out.println("8. Seleccionar jugador");
            System.out.println("8. Seleccionar equipo");
            System.out.println("9. salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    if (equipos[0] == null) {
                        System.out.println("No hay equipos disponibles");
                        Jugador nuevoJugador = new Jugador(nombre, null);
                        jugadores[Jugador.getContadorJugadores() - 1] = nuevoJugador;
                    } else {
                        System.out.println("Elija un equipo:");
                        Equipo.tablaEquipos(equipos);
                        System.out.print("Elija una opción: ");
                        int opcionEquipo = scanner.nextInt();
                        scanner.nextLine();
                        Jugador nuevoJugador = new Jugador(nombre, equipos[opcionEquipo - 1]);
                        jugadores[Jugador.getContadorJugadores() - 1] = nuevoJugador;
                    }
                    System.out.println("Nuevo jugador  creado!");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del equipo:");
                    String nombreEquipo = scanner.nextLine();
                    Equipo nuevoEquipo = new Equipo(nombreEquipo);
                    equipos[Equipo.getContadorEquipos() - 1] = nuevoEquipo;
                    System.out.println("Nuevo equipo creado!");
                    break;
                case 3:
                    if (jugadores[0] == null) {
                        System.out.println("No hay jugadores");
                    } else {
                        System.out.println("Elija un jugador:");
                        Jugador.tablaJugadores(jugadores);
                        System.out.print("Elija una opción: ");
                        int opcionJugador = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Elija su nuevo equipo:");
                        Equipo.tablaEquipos(equipos);
                        System.out.print("Elija una opción: ");
                        int opcionEquipoAsignar = scanner.nextInt();
                        scanner.nextLine();
                        jugadores[opcionJugador - 1].setEquipo(equipos[opcionEquipoAsignar - 1]);
                        System.out.println("Jugador " + jugadores[opcionJugador - 1].getNombre()
                                + " ha sido asignado al equipo " + equipos[opcionEquipoAsignar - 1].getNombre());
                    }
                    break;
                case 4:
                    if (jugadores[0] == null) {
                        System.out.println("No hay jugadores");
                    } else {
                        Jugador.tablaJugadores(jugadores);
                    }
                    break;
                case 5:
                    if (equipos[0] == null) {
                        System.out.println("No hay equipos");
                    } else {
                        Equipo.tablaEquipos(equipos);
                    }
                    break;
                case 6:
                    System.out.println("Elija un jugador para eliminar:");
                    Jugador.tablaJugadores(jugadores);
                    System.out.print("Elija una opción: ");
                    int opcionEliminar = scanner.nextInt();
                    scanner.nextLine();
                    Jugador.eliminarJugador(jugadores, opcionEliminar - 1);
                    break;
                case 7:
                    System.out.println("Elija un equipo para eliminar:");
                    Equipo.tablaEquipos(equipos);
                    System.out.print("Elija una opción: ");
                    int opcionEliminarEquipo = scanner.nextInt();
                    scanner.nextLine();
                    Equipo.eliminarEquipo(equipos, opcionEliminarEquipo - 1);
                    break;

                case 8:
                    System.out.println("Elija un jugador para seleccionar:");
                    Jugador.tablaJugadores(jugadores);
                    System.out.print("Elija una opción: ");
                    int opcionSeleccionarJugador = scanner.nextInt();
                    scanner.nextLine();
                    if (opcionSeleccionarJugador < 1 || opcionSeleccionarJugador > Jugador.getContadorJugadores()) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                    // Selección del jugador
                    Jugador jugadorSeleccionado = jugadores[opcionSeleccionarJugador - 1];
                    int opcionSubMenu = 0;
                    do {
                        System.out.println("Submenú para el jugador seleccionado:");
                        System.out.println("1. Ver detalles");
                        System.out.println("2. Cambiar nombre");
                        System.out.println("3. Regresar al menú principal");
                        System.out.print("Elija una opción: ");
                        opcionSubMenu = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionSubMenu) {
                            case 1:
                                System.out.println("Detalles del jugador:");
                                System.out.println("Nombre: " + jugadorSeleccionado.getNombre());
                                System.out.println("Equipo: " + (jugadorSeleccionado.getEquipo() != null
                                        ? jugadorSeleccionado.getEquipo().getNombre()
                                        : "Sin equipo"));
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo nombre del jugador:");
                                String nuevoNombre = scanner.nextLine();
                                jugadorSeleccionado.setNombre(nuevoNombre);
                                System.out.println("Nombre del jugador actualizado.");
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal.");
                                break;
                            default:
                                System.out.println("Opción no válida, intente nuevamente.");
                                break;
                        }
                    } while (opcionSubMenu != 3);
                    break;
                case 9:
                    System.out.println("Elija un equipo para seleccionar:");
                    Equipo.tablaEquipos(equipos);
                    System.out.print("Elija una opción: ");
                    int opcionSeleccionarEquipo = scanner.nextInt();
                    scanner.nextLine();
                    if (opcionSeleccionarEquipo < 1 || opcionSeleccionarEquipo > Equipo.getContadorEquipos()) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                    Equipo equipoSeleccionado = equipos[opcionSeleccionarEquipo - 1];
                    int opcionSubMenuEquipo = 0;
                    do {
                        System.out.println("Submenú para el equipo seleccionado:");
                        System.out.println("1. Ver detalles");
                        System.out.println("2. Cambiar nombre");
                        System.out.println("3. Agregar jugador al equipo");
                        System.out.println("4. Mostrar jugadores del equipo");
                        System.out.println("5. Regresar al menú principal");
                        System.out.print("Elija una opción: ");
                        opcionSubMenuEquipo = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionSubMenuEquipo) {
                            case 1:
                                System.out.println("Detalles del equipo:");
                                System.out.println("Nombre: " + equipoSeleccionado.getNombre());
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo nombre del equipo:");
                                String nuevoNombreEquipo = scanner.nextLine();
                                for (Jugador jugador : jugadores) {
                                    if (jugador != null && jugador.getEquipo() == equipoSeleccionado) {
                                        jugador.getEquipo().setNombre(nuevoNombreEquipo);
                                    }
                                }
                                System.out.println("Nombre del equipo actualizado.");
                                break;
                            case 3:
                                if (jugadores[0] == null) {
                                    System.out.println("No hay jugadores");
                                } else {
                                    System.out.println("Elija un jugador para agregar al equipo:");
                                    Jugador.tablaJugadores(jugadores);
                                    System.out.print("Elija una opción: ");
                                    int opcionJugador = scanner.nextInt();
                                    scanner.nextLine();
                                    if (opcionJugador < 1 || opcionJugador > Jugador.getContadorJugadores()) {
                                        System.out.println("Opción inválida.");
                                        break;
                                    }
                                    Jugador jugadorAsignado = jugadores[opcionJugador - 1];
                                    jugadorAsignado.setEquipo(equipoSeleccionado);
                                    System.out.println("Jugador " + jugadorAsignado.getNombre()
                                            + " ha sido asignado al equipo " + equipoSeleccionado.getNombre());
                                }
                                break;
                            case 4:
                                System.out.println("Jugadores del equipo " + equipoSeleccionado.getNombre() + ":");
                                boolean hayJugadores = false;
                                for (Jugador jugador : jugadores) {
                                    if (jugador != null && jugador.getEquipo() == equipoSeleccionado) {
                                        System.out.println("- " + jugador.getNombre());
                                        hayJugadores = true;
                                    }
                                }
                                if (!hayJugadores) {
                                    System.out.println("No hay jugadores en este equipo.");
                                }
                                break;
                            case 5:
                                System.out.println("Regresando al menú principal.");
                                break;
                            default:
                                System.out.println("Opción no válida, intente nuevamente.");
                                break;
                        }
                    } while (opcionSubMenuEquipo != 5);
                    break;
                case 10:
                    System.out.println("Gracias por usar la aplicación.");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        } while (opcion != 9);
        scanner.close();
    }

}
