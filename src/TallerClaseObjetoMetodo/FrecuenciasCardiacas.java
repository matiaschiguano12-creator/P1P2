package TallerClaseObjetoMetodo;

import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    // Constructor
    public FrecuenciasCardiacas(String nombre, String apellido,
                                int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    // Calcular edad
    public int obtenerEdad() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioNacimiento;
    }

    // Frecuencia cardiaca máxima
    public int obtenerFrecuenciaMaxima() {
        return 220 - obtenerEdad();
    }

    // Frecuencia cardiaca esperada mínima (50%)
    public double obtenerFrecuenciaMinima() {
        return obtenerFrecuenciaMaxima() * 0.50;
    }

    // Frecuencia cardiaca esperada máxima (85%)
    public double obtenerFrecuenciaMaximaEsperada() {
        return obtenerFrecuenciaMaxima() * 0.85;
    }
}
