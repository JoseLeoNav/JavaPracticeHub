package POO;

public class PersonaApplication {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jose";
        persona1.edad = 25;
        persona1.imprimirDatos();
        Persona persona2 = new Persona();
        persona2.nombre = "Pepe";
        persona2.edad = 13;
        persona2.imprimirDatos();
    }
}

class Persona {
    String nombre;
    int edad;
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
