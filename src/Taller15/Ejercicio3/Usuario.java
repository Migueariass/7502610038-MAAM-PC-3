package Taller15.Ejercicio3;

// Responsabilidad única: Almacenar las credenciales y datos del usuario
public class Usuario {
    private String correo;
    private String contrasena;

    public Usuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}