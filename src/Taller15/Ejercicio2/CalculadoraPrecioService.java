package Taller15.Ejercicio2;

// Responsabilidad única: Calcular precios finales aplicando impuestos
public class CalculadoraPrecioService {
    public double calcularPrecioConIVA(Producto producto, double porcentajeIva) {
        return producto.getPrecioBase() * (1 + porcentajeIva);
    }
}