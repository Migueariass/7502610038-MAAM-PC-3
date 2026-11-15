package Taller17.Ejercicio3;

public class Main {
    public static void iniciarViaje(Transporte transporte) {
        transporte.desplazar();
    }

    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta("GW Alligator");
        Transporte coche = new Coche("Mazda 3");

        // Ambos subtipos reemplazan a Transporte sin alterar la lógica del cliente
        iniciarViaje(bicicleta);
        iniciarViaje(coche);
    }
}