package EjerciciosGuiadosS3;

public class Motor {

    private String nombre;
    private boolean encendido;
    private int velocidad;

    public Motor(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
        this.velocidad = 0;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void ajustarVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        }
    }

    public void mostrarEstado() {
        System.out.println("Motor: " + nombre);
        System.out.println("Encendido: " + encendido);
        System.out.println("Velocidad: " + velocidad);
    }
}