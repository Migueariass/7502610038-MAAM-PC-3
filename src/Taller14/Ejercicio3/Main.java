package Taller14.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 1. Error de compilación al invocar un método exclusivo de la clase derivada
        Dispositivo miDispositivo = new Smartphone();
        miDispositivo.encender();

        // Descomentar la siguiente línea para evidenciar el error de compilación:
        // miDispositivo.tomarFoto(); // Error: cannot find symbol (método tomarFoto() no existe en Dispositivo)

        // 2. Mala práctica sin error de compilación
        Dispositivo miTv = new Televisor();
        miTv.encender();
    }
}