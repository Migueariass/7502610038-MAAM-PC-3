package Taller17.Ejercicio1;

public class Main {
    // Método cliente que depende únicamente de la clase base Figura
    public static void imprimirArea(Figura figura) {
        System.out.printf("El área de la figura (%s) es: %.2f%n",
                figura.getClass().getSimpleName(), figura.calcularArea());
    }

    public static void main(String[] args) {
        Figura circulo = new Circulo(4.5);
        Figura rectangulo = new Rectangulo(5.0, 3.0);

        // Ambas subclases sustituyen a Figura sin alterar el funcionamiento del programa
        imprimirArea(circulo);
        imprimirArea(rectangulo);
    }
}