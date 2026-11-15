package Taller16.Ejercicio3;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[PUSH] Dispositivo ID: " + destinatario + " | Alerta: " + mensaje);
    }
}