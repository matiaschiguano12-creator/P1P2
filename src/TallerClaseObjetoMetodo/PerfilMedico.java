package TallerClaseObjetoMetodo;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double altura, double peso) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
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

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int obtenerEdad() {
        return 2026 - anioNacimiento;
    }

    public int obtenerFrecuenciaMaxima() {
        return 220 - obtenerEdad();
    }

    public double obtenerFrecuenciaMinima() {
        return obtenerFrecuenciaMaxima() * 0.50;
    }

    public double obtenerFrecuenciaMaximaEsperada() {
        return obtenerFrecuenciaMaxima() * 0.85;
    }

    public double obtenerBMI() {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }
}
