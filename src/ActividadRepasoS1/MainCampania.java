package ActividadRepasoS1;

public class MainCampania {

    static void main() {

        Campania instagram = new Campania();
        Campania tiktok = new Campania();
        Campania facebook = new Campania();

        instagram.nombre = "Promo Verano";
        instagram.presupuesto = 500;
        instagram.plataforma = "Instagram";
        instagram.activa = false;

        tiktok.nombre = "Lanzamiento";
        tiktok.presupuesto = 700;
        tiktok.plataforma = "TikTok";
        tiktok.activa = false;

        facebook.nombre = "Ofertas";
        facebook.presupuesto = 400;
        facebook.plataforma = "Facebook";
        facebook.activa = true;

        //mostrar info antes del cambio
        instagram.mostrarInformacion();

        tiktok.mostrarInformacion();

        facebook.mostrarInformacion();

        //cambio de estado
        instagram.activar();

        //mostrar info despues del cambio
        instagram.mostrarInformacion();
        instagram.mostrarPresupuesto();

        tiktok.mostrarInformacion();
        tiktok.mostrarPresupuesto();

        facebook.mostrarInformacion();
        facebook.mostrarPresupuesto();
    }

}
