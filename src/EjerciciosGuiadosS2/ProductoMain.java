package EjerciciosGuiadosS2;

public class ProductoMain {

    public static void main(String[] args) {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.setNombre("Mouse");
        producto1.setPrecio(20);
        producto1.setCategoria("Tecnología");

        producto2.setNombre("Curso Java");
        producto2.setPrecio(75);
        producto2.setCategoria("Educación");

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();

        producto1.setPrecio(25);

        System.out.println("\nDespués de modificar:");

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}
