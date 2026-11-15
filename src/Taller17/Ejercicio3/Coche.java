package Taller17.Ejercicio3;

public class Coche extends Transporte {
    public Coche(String modelo) {
        super(modelo);
    }

    @Override
    public void desplazar() {
        System.out.println("El coche (" + modelo + ") se desplaza utilizando su motor.");
    }
}