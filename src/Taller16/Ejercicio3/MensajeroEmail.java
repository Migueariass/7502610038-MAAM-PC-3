package Taller16.Ejercicio3;

public class MensajeroEmail extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}