package EjercicioGuiadoS4;

public class MainDispositivo {

    public static void main(String[] args) {

        System.out.println("Total: " +
                Dispositivo.getTotalCreados());

        Dispositivo d1 =
                new Dispositivo("Laptop", "Computadora");

        Dispositivo d2 =
                new Dispositivo("Mouse", "Periferico");

        Dispositivo d3 =
                new Dispositivo("Teclado", "Periferico");

        System.out.println(
                "Total creados: "
                        + Dispositivo.getTotalCreados());

        System.out.println(d1.getNombre());
        System.out.println(d2.getNombre());
        System.out.println(d3.getNombre());
    }
}
