package GestionDeBiblioteca.Modelos;

public class Revista extends ItemBiblioteca implements Catalogable {

    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    public Revista() {

    }

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public double calcularMultas() {
        return 0.0;

    }

    @Override
    public void devolver() {

        cantidadEjemplares++;

        System.out.println("La revista " +
                this.nombreRevista.toUpperCase() + " se ha devuelto correctamente.");
    }

    @Override
    public void prestar() {

        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;

            System.out.println("La revista " + this.nombreRevista.toUpperCase() + " se ha prestado correctamente.");
        } else {
            System.out.println(
                    "No hay ejemplares disponibles para prestar de la revista: " + this.nombreRevista.toUpperCase());
        }
    }

    @Override
    public String obtenerInformacion() {
        return "Nombre de la revista: " + nombreRevista + "\n" +
                "Número de edición: " + nroEdicion + "\n" +
                "Cantidad de ejemplares: " + cantidadEjemplares + "\n" +
                "******************************";

    };

}
