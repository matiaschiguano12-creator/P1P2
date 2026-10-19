package TwoExtras;

public class MainLuzInteligente {

    public static void main(String[] args) {

        LuzInteligente luz = new LuzInteligente(false, 50);

        luz.encender();
        luz.aumentarBrillo();

        System.out.println("Encendida: " + luz.getEncendida());
        System.out.println("Brillo: " + luz.getBrillo());
    }
}
