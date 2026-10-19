package TwoExtras;

public class Agente {

    private String nombre;
    private int nivelEnergia;
    private String estado;

    public Agente(String nombre, int nivelEnergia, String estado) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void recargarEnergia() {
        nivelEnergia = 100;
    }

    public void trabajar() {
        nivelEnergia = nivelEnergia - 20;
    }

    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }
}
