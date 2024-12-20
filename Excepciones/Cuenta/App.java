package Cuenta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Cuanto es el monto inicial de su cuenta bancaria? : ");
            int saldo = scanner.nextInt();
            scanner.nextLine();
            cuenta.setSaldoInicial(saldo);
            System.out.print("Cuanto desea retirar? :");
            int retiro = scanner.nextInt();
            scanner.nextLine();
            cuenta.retirar(retiro);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } 
        finally{
            scanner.close();
        }
    }
    
}
