package GestionDeBiblioteca.Modelos;

public class Pelicula extends ItemBiblioteca implements Catalogable {

    @Override
    public double calcularMultas() {
        return 0.0;

    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void prestar() {
        // TODO Auto-generated method stub

    }

    @Override
    public String obtenerInformacion() {
        return "Los datos de la película";
    }

}
