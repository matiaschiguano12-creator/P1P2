package TwoExtras;

public class MainAgente {

    public static void main(String[] args) {

        Agente agente = new Agente(
                "Copilot",
                80,
                "Activo"
        );

        agente.trabajar();

        System.out.println("Nombre: " + agente.getNombre());
        System.out.println("Energia: " + agente.getNivelEnergia());
        System.out.println("Estado: " + agente.getEstado());

        agente.recargarEnergia();

        System.out.println("Energia recargada: "
                + agente.getNivelEnergia());
    }
}
