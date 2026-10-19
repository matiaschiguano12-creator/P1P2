package EjerciciosGuiadosS2;

public class Sensor {

    private String nombre;
    private String tipo;
    private double lectura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setLectura(double lectura) {
        this.lectura = lectura;
    }

    public double getLectura() {
        return lectura;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura);
    }

    public void mostrarLectura() {
        System.out.println("Lectura actual: " + lectura);
    }

    public void actualizarLectura(double nuevaLectura) {
        lectura = nuevaLectura;
    }
}
