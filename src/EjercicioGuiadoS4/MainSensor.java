package EjercicioGuiadoS4;

public class MainSensor {

    public static void main(String[] args) {

        Sensor s1 = new Sensor("Sensor 1", "Temperatura");

        Sensor s2 = new Sensor("Sensor 2", "Movimiento");

        Sensor s3 = new Sensor("Sensor 3", "Humedad");

        System.out.println("Total sensores: " + Sensor.getTotalCreados());
    }
}
