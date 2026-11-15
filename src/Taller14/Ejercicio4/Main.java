package Taller14.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.mover(); // Ejecuta el método sobrescrito en Coche
        vehiculo2.mover(); // Ejecuta el método sobrescrito en Bicicleta
    }
}