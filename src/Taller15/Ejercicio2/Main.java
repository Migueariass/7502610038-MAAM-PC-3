package Taller15.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("PRD-001", "Teclado Mecánico", 250000.0);

        CalculadoraPrecioService calculadora = new CalculadoraPrecioService();
        EtiquetaProductoService etiquetaService = new EtiquetaProductoService();

        double precioFinal = calculadora.calcularPrecioConIVA(producto, 0.19);
        etiquetaService.generarEtiqueta(producto, precioFinal);
    }
}