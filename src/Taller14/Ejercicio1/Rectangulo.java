package Taller14.Ejercicio1;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.printf("El área del rectángulo (%.2f x %.2f) es: %.2f%n", base, altura, area);
    }
}