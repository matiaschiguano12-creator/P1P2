package EjerciciosGuiadosS2;

public class Dispositivo {

    private String nombre;
    private String tipo;
    private boolean activo;

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

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + activo);
    }

    public void activar() {
        activo = true;
    }
}