package Cuenta;

public class CuentaBancaria {
    int saldoInicial;

    public void retirar(int monto) throws Exception {
        if (monto > saldoInicial) {
            throw new SaldoInsuficienteException("El monto a retirar es mayor que el dinero en la cuenta.");
        }
        saldoInicial = saldoInicial - monto;
        System.out.println("Su estado de cuenta es: " + saldoInicial);
        ;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
