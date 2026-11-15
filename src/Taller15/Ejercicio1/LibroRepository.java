package Taller15.Ejercicio1;

// Responsabilidad única: Gestionar la persistencia (almacenamiento) del libro
public class LibroRepository {
    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' (ISBN: " + libro.getIsbn() + ") en la base de datos...");
    }
}