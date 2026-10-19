package EjerciciosGuiadosS3;

public class LuzInteligente {

    private String ubicacion;
    private boolean encendida;
    private int brillo;

    public LuzInteligente(String ubicacion) {
        this.ubicacion = ubicacion;
        this.encendida = false;
        this.brillo = 50;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void ajustarBrillo(int brillo) {
        if (brillo >= 0 && brillo <= 100) {
            this.brillo = brillo;
        }
    }

    public void mostrarEstado() {
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Encendida: " + encendida);
        System.out.println("Brillo: " + brillo + "%");
    }
}
