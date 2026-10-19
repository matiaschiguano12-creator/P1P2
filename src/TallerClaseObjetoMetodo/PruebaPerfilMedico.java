package TallerClaseObjetoMetodo;

import javax.swing.JOptionPane;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo:");

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el día de nacimiento:")
        );

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes de nacimiento:")
        );

        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año de nacimiento:")
        );

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la altura (cm):")
        );

        double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el peso (kg):")
        );

        PerfilMedico persona = new PerfilMedico(
                nombre, apellido, sexo,
                dia, mes, anio,
                altura, peso
        );

        String mensaje =
                "===== PERFIL MÉDICO =====\n\n" +
                        "Nombre: " + persona.getNombre() + "\n" +
                        "Apellido: " + persona.getApellido() + "\n" +
                        "Sexo: " + persona.getSexo() + "\n" +
                        "Fecha de nacimiento: "
                        + persona.getDiaNacimiento() + "/"
                        + persona.getMesNacimiento() + "/"
                        + persona.getAnioNacimiento() + "\n" +
                        "Altura: " + persona.getAltura() + " cm\n" +
                        "Peso: " + persona.getPeso() + " kg\n\n" +

                        "Edad: " + persona.obtenerEdad() + " años\n" +
                        "BMI: " + String.format("%.2f", persona.obtenerBMI()) + "\n" +
                        "Frecuencia cardiaca máxima: "
                        + persona.obtenerFrecuenciaMaxima() + " ppm\n" +

                        "Frecuencia esperada mínima: "
                        + String.format("%.2f", persona.obtenerFrecuenciaMinima()) + " ppm\n" +

                        "Frecuencia esperada máxima: "
                        + String.format("%.2f", persona.obtenerFrecuenciaMaximaEsperada()) + " ppm\n\n" +

                        "TABLA BMI\n" +
                        "Bajo peso: menos de 18.5\n" +
                        "Normal: entre 18.5 y 24.9\n" +
                        "Sobrepeso: entre 25 y 29.9\n" +
                        "Obeso: 30 o más";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
