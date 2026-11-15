package Taller16.Ejercicio2;

public class DocumentoWord extends Documento {
    public DocumentoWord(String titulo, String contenido) {
        super(titulo, contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando '" + titulo + ".docx' como documento editable de Word...");
    }
}