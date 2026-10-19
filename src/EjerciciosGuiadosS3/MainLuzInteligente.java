package EjerciciosGuiadosS3;

public class MainLuzInteligente {

    public static void main(String[] args) {

        LuzInteligente luz =
                new LuzInteligente("Sala");

        luz.encender();
        luz.ajustarBrillo(80);

        luz.mostrarEstado();
    }
}