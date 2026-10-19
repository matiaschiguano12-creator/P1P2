package TallerClaseObjetoMetodo;

public class PruebaFecha {

    public static void main(String[] args) {

        Fecha fecha1 = new Fecha(10, 18, 2026);

        System.out.println("Fecha inicial:");
        fecha1.mostrarFecha();

        // Modificar la fecha
        fecha1.setMes(12);
        fecha1.setDia(25);
        fecha1.setAnio(2026);

        System.out.println("Fecha modificada:");
        fecha1.mostrarFecha();
    }
}
