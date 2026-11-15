package Taller14.Ejercicio2;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy una persona y mi nombre es " + nombre + ".");
    }
}