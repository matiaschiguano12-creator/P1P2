package EjerciciosGuiadosS3;

public class MainSensorTemperatura {

    public static void main(String[] args) {

        SensorTemperatura sensor =
                new SensorTemperatura("Laboratorio", 25.5);

        sensor.mostrarLectura();
    }
}