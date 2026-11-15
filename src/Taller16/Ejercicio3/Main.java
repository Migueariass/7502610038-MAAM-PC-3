package Taller16.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();

        Mensajero email = new MensajeroEmail();
        Mensajero sms = new MensajeroSMS();
        Mensajero push = new MensajeroPush();

        servicio.notificar(email, "mariasm1@unicartagena.edu.co", "Taller 16 completado.");
        servicio.notificar(sms, "+57 30012320011", "Tu código de verificación es 4829.");
        servicio.notificar(push, "DEVICE-TOKEN-99", "Nueva actividad disponible en SIMA.");
    }
}