package Taller15.Ejercicio1;

// Responsabilidad única: Generar reportes de información del libro
public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("=== REPORTE DEL LIBRO ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
    }
}