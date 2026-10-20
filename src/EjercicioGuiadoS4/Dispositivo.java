package EjercicioGuiadoS4;

public class Dispositivo {

    private String nombre;
    private String tipo;

    private static int contador = 0;

    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getTotalCreados() {
        return contador;
    }
}