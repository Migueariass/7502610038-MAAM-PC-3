package Taller16.Ejercicio1;

public class DescuentoPorcentaje extends Descuento {
    private double porcentaje; // Ejemplo: 0.15 para 15%

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * porcentaje);
    }
}