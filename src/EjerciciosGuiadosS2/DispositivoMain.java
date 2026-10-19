package EjerciciosGuiadosS2;

public class DispositivoMain {

    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);

        dispositivo2.setNombre("Celular");
        dispositivo2.setTipo("Móvil");
        dispositivo2.setActivo(false);

        dispositivo1.mostrarInformacion();
        dispositivo2.mostrarInformacion();

        dispositivo1.setActivo(false);

        System.out.println("\nDespués de modificar:");

        dispositivo1.mostrarInformacion();
        dispositivo2.mostrarInformacion();
    }
}
