package Taller15.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code", "Robert C. Martin", "978-0132350884");

        ReporteLibroService reporteService = new ReporteLibroService();
        LibroRepository libroRepository = new LibroRepository();

        reporteService.generarReporte(libro);
        libroRepository.guardarEnBaseDeDatos(libro);
    }
}