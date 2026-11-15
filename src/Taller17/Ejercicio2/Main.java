package Taller17.Ejercicio2;

public class Main {
    // Proceso estándar que espera cualquier CuentaBancaria
    public static void realizarOperacionEstandar(CuentaBancaria cuenta) {
        cuenta.depositar(100000.0);
        cuenta.retirar(40000.0);
        System.out.printf("Saldo final verificado: $%.2f%n%n", cuenta.getSaldo());
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaGeneral = new CuentaBancaria("001-98765", 200000.0);
        CuentaBancaria cuentaAhorros = new CuentaAhorros("002-54321", 200000.0, 0.02);

        // CuentaAhorros sustituye perfectamente a CuentaBancaria cumpliendo LSP
        realizarOperacionEstandar(cuentaGeneral);
        realizarOperacionEstandar(cuentaAhorros);
    }
}