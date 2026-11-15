package Taller15.Ejercicio3;

// Responsabilidad única: Gestionar el inicio de sesión y verificación de credenciales
public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String correoIngresado, String contrasenaIngresada) {
        return usuario.getCorreo().equals(correoIngresado) &&
                usuario.getContrasena().equals(contrasenaIngresada);
    }
}