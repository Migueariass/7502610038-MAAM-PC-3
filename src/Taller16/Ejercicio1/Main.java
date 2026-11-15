package Taller16.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento();
        double precioProducto = 200000.0;

        Descuento descPorcentaje = new DescuentoPorcentaje(0.20); // 20%
        Descuento descFijo = new DescuentoFijo(35000.0);          // $35.000 fijos

        System.out.printf("Precio con 20%% de descuento: $%.2f%n", calculadora.calcularPrecioFinal(descPorcentaje, precioProducto));
        System.out.printf("Precio con descuento fijo de $35.000: $%.2f%n", calculadora.calcularPrecioFinal(descFijo, precioProducto));
    }
}