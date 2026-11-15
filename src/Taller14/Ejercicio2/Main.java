package Taller14.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos");
        Persona estudiante = new Estudiante("Ana", "Ingeniería de Software");
        Persona profesor = new Profesor("John Arrieta", "Programación Orientada a Objetos");

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}