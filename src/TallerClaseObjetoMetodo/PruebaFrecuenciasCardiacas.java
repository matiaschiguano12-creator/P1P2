package TallerClaseObjetoMetodo;

import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(
                nombre, apellido, dia, mes, anio);

        System.out.println("\n===== INFORMACIÓN =====");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: "
                + persona.getDiaNacimiento() + "/"
                + persona.getMesNacimiento() + "/"
                + persona.getAnioNacimiento());

        System.out.println("Edad: " + persona.obtenerEdad() + " años");
        System.out.println("Frecuencia cardiaca máxima: "
                + persona.obtenerFrecuenciaMaxima() + " ppm");

        System.out.println("Rango de frecuencia cardiaca esperada:");
        System.out.println("Mínima (50%): "
                + persona.obtenerFrecuenciaMinima() + " ppm");
        System.out.println("Máxima (85%): "
                + persona.obtenerFrecuenciaMaximaEsperada() + " ppm");

        entrada.close();
    }
}
