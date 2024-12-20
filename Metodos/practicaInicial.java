package Metodos;

import java.util.Scanner;

public class practicaInicial{

    // public static Scanner luis = new Scanner(System.in);
    // public static void main(String[] args) {

    //     String nombre = obtenerNombre(luis);
    //     int edad = obtenerEdad(luis);

    //     nombreYedad(nombre, edad);
    // }

    // public static void nombreYedad(String nombre, int edad) {
    //     System.out.println("Te llamas " + nombre + " y tienes "+ edad + " años");
    // }

    // public static String obtenerNombre(Scanner X){
    //     System.out.print("Porfavor ingresa tu nombre: ");
    //     return X.nextLine();
    // }

    // public static int obtenerEdad(Scanner Y) {
    //     System.out.print("Porfavor ingresa tu edad: ");
    //     return Y.nextInt();        
    // }

    public static Scanner luis = new Scanner(System.in);
    public static void main(String[] args) {

        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        nombreYedad(nombre, edad);
    }

    public static void nombreYedad(String nombre, int edad) {
        System.out.println("Te llamas " + nombre + " y tienes "+ edad + " años");
    }

    public static String obtenerNombre(){
        System.out.print("Porfavor ingresa tu nombre: ");
        return luis.nextLine();
    }

    public static int obtenerEdad() {
        System.out.print("Porfavor ingresa tu edad: ");
        return luis.nextInt();        
    }

}
