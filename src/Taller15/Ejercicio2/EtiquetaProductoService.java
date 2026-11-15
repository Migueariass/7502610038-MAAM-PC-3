package Taller15.Ejercicio2;

// Responsabilidad única: Generar la etiqueta visual del producto
public class EtiquetaProductoService {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("-----------------------------");
        System.out.println("CÓDIGO: " + producto.getCodigo());
        System.out.println("PRODUCTO: " + producto.getNombre());
        System.out.printf("PRECIO FINAL: $%.2f%n", precioFinal);
        System.out.println("-----------------------------");
    }
}