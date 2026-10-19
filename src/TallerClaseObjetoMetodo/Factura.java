package TallerClaseObjetoMetodo;

public class Factura {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioArticulo;

    // Constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        if (precioArticulo > 0) {
            this.precioArticulo = precioArticulo;
        } else {
            this.precioArticulo = 0.0;
        }
    }

    // Métodos get
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    // Métodos set
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public void setPrecioArticulo(double precioArticulo) {
        if (precioArticulo > 0) {
            this.precioArticulo = precioArticulo;
        } else {
            this.precioArticulo = 0.0;
        }
    }

    // Metodo para calcular el monto de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioArticulo;
    }
}