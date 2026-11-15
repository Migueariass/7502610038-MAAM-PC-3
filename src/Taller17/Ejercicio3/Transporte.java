package Taller17.Ejercicio3;

public abstract class Transporte {
    protected String modelo;

    public Transporte(String modelo) {
        this.modelo = modelo;
    }

    public abstract void desplazar();
}