package TallerClaseObjetoMetodo;

public class PruebaFactura {

    public static void main(String[] args) {

        Factura factura1 = new Factura(
                "P001",
                "Martillo",
                5,
                12.50);

        System.out.println("DATOS DE LA FACTURA");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: $" + factura1.getPrecioArticulo());

        System.out.println("\nMonto total de la factura: $" +
                factura1.obtenerMontoFactura());
    }
}
