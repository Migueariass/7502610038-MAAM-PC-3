package Taller16.Ejercicio1;

public class CalculadoraDescuento {
    public double calcularPrecioFinal(Descuento tipoDescuento, double precio) {
        return tipoDescuento.aplicarDescuento(precio);
    }
}