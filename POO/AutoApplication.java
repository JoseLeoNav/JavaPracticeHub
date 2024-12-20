package POO;

public class AutoApplication {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", 2020, 2023);
        Auto auto2 = new Auto("Honda", 2018);
        Auto auto3 = new Auto("Ford");
        Auto auto4 = new Auto("Nissan", 2017, 2020);


        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
    }
}

class Auto {
    String marca;
    int modelo = 0; 
    int año = 0;    

    public Auto(String marca, int modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Auto(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + (marca != null ? marca : "No especificado"));
        
        if (modelo != 0) {
            System.out.println("Modelo: " + modelo);
        } else {
            System.out.println("Modelo: No especificado");
        }
        
        if (año != 0) {
            System.out.println("Año: " + año);
        } else {
            System.out.println("Año: No especificado");
        }
        
        System.out.println(); 
    }
}
