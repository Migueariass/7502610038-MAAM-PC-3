package Taller17.Ejercicio3;

public class Bicicleta extends Transporte {
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void desplazar() {
        System.out.println("La bicicleta (" + modelo + ") se desplaza mediante pedaleo.");
    }
}