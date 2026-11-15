package Taller16.Ejercicio3;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[SMS] Número: " + destinatario + " | Mensaje: " + mensaje);
    }
}