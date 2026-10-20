package EjerciciosGuiadosS3;

public class SensorTemperatura {

    private String ubicacion;
    private double temperatura;
 
    public SensorTemperatura(String ubicacion, double temperatura) {
        this.ubicacion = ubicacion;
        this.temperatura = temperatura;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void mostrarLectura() {
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Temperatura: " + temperatura + "°C");
    }
}
