package Taller15.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("estudiante@unicartagena.edu.co", "poo2026");

        ValidacionUsuarioService validador = new ValidacionUsuarioService();
        AutenticacionService autenticador = new AutenticacionService();

        if (validador.validarFormato(usuario)) {
            System.out.println("Formato de usuario válido.");
            boolean acceso = autenticador.autenticar(usuario, "estudiante@unicartagena.edu.co", "poo2026");
            System.out.println(acceso ? "Autenticación exitosa." : "Credenciales incorrectas.");
        } else {
            System.out.println("El formato del correo o la contraseña no cumple los requisitos.");
        }
    }
}