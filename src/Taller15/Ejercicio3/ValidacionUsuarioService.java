package Taller15.Ejercicio3;

// Responsabilidad única: Validar el formato correcto de los datos del usuario
public class ValidacionUsuarioService {
    public boolean validarFormato(Usuario usuario) {
        boolean correoValido = usuario.getCorreo() != null && usuario.getCorreo().contains("@");
        boolean contrasenaValida = usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;
        return correoValido && contrasenaValida;
    }
}