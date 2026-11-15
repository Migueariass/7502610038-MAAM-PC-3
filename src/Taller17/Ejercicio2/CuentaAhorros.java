package Taller17.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Extiende funcionalidad sin violar el contrato de depósito y retiro de CuentaBancaria
    public void aplicarIntereses() {
        double interesGanado = saldo * tasaInteres;
        depositar(interesGanado);
    }
}