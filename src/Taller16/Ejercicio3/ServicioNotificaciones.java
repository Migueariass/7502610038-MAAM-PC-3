package Taller16.Ejercicio3;

public class ServicioNotificaciones {
    public void notificar(Mensajero canal, String destinatario, String mensaje) {
        canal.enviarMensaje(destinatario, mensaje);
    }
}