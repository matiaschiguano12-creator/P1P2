package EjercicioGuiadoS4;

public class MainProducto {

    public static void main(String[] args) {

        Producto p1 = new Producto("Mouse", 20, "Tecnologia");

        Producto p2 = new Producto("Teclado", 30, "Tecnologia");

        Producto p3 = new Producto("Monitor", 150, "Tecnologia");

        System.out.println("Total productos: " + Producto.getTotalCreados());
    }
}