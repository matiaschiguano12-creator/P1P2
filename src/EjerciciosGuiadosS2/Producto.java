package EjerciciosGuiadosS2;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
    }

    public void mostrarCategoria() {
        System.out.println("Categoría: " + categoria);
    }

    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }
}
