package Taller14.Ejercicio1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área del círculo con radio %.2f es: %.2f%n", radio, area);
    }
}