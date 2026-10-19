package EjerciciosGuiadosS2;

public class SensorMain {

    public static void main(String[] args) {

        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        sensor1.setNombre("Sensor Temperatura");
        sensor1.setTipo("Temperatura");
        sensor1.setLectura(25.5);

        sensor2.setNombre("Sensor Humedad");
        sensor2.setTipo("Humedad");
        sensor2.setLectura(60);

        sensor1.mostrarInformacion();
        sensor2.mostrarInformacion();

        sensor1.setLectura(30);

        System.out.println("\nDespués de modificar:");

        sensor1.mostrarInformacion();
        sensor2.mostrarInformacion();
    }
}