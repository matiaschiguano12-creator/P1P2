package ActividadRepasoS1;

public class MainProducto {
    static void main() {

        //Creacion de nuevos productos
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        //Nombres
        p1.nombre = "Queso";
        p2.nombre = "Pan";
        p3.nombre = "Cebolla";

        //Precios
        p1.precio = 3;
        p2.precio = 1;
        p3.precio = 1.5;

        //Categoria
        p1.categoria = "Lacteo";
        p2.categoria = "Harinas";
        p3.categoria = "Vegetal";

        //Disponibilidad
        p1.disponible = true;
        p2.disponible = false;
        p3.disponible = true;
    }
}
