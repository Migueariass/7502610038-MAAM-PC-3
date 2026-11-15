package Taller17.Ejercicio2;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.printf("Depósito de $%.2f en cuenta %s. Nuevo saldo: $%.2f%n", monto, numeroCuenta, saldo);
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.printf("Retiro de $%.2f en cuenta %s. Nuevo saldo: $%.2f%n", monto, numeroCuenta, saldo);
            return true;
        }
        System.out.println("Fondos insuficientes o monto inválido en cuenta " + numeroCuenta);
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}