package ActividadRepasoS1;

public class MainCupon {

    static void main() {

        Cupon cupon1 = new Cupon();
        Cupon cupon2 = new Cupon();
        Cupon cupon3 = new Cupon();

        cupon1.codigo = "VERANO20";
        cupon1.porcentajeDescuento = 20;
        cupon1.descripcion = "Descuento de verano";
        cupon1.activo = true;

        cupon2.codigo = "ESCOLAR15";
        cupon2.porcentajeDescuento = 15;
        cupon2.descripcion = "Regreso a clases";
        cupon2.activo = false;

        cupon3.codigo = "CLIENTE10";
        cupon3.porcentajeDescuento = 10;
        cupon3.descripcion = "Cliente frecuente";
        cupon3.activo = true;

        cupon1.mostrarInformacion();

        System.out.println();

        cupon1.mostrarResumen();
    }
}
