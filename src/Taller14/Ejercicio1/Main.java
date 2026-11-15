package Taller14.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Uso de referencias de la clase base Figura apuntando a clases derivadas
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 6.0);

        figura1.calcularArea(); // Invoca calcularArea() de Circulo
        figura2.calcularArea(); // Invoca calcularArea() de Rectangulo
    }
}