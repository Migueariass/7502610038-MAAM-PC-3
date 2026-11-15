package Taller16.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ExportadorDocumentos exportador = new ExportadorDocumentos();

        Documento docPdf = new DocumentoPDF("Informe_Unidad3", "Contenido del informe");
        Documento docWord = new DocumentoWord("Protocolo_POO", "Desarrollo de talleres");
        Documento docExcel = new DocumentoExcel("Notas_Estudiantes", "Listado de calificaciones");

        exportador.procesarExportacion(docPdf);
        exportador.procesarExportacion(docWord);
        exportador.procesarExportacion(docExcel);
    }
}