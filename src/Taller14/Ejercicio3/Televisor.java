package Taller14.Ejercicio3;

public class Televisor extends Dispositivo {
    // MALA PRÁCTICA: Sobrescribir un método únicamente para llamar a super.encender()
    // sin agregar ni modificar lógica. Genera código redundante e innecesario.
    @Override
    public void encender() {
        super.encender();
    }
}