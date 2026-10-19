package TallerClaseObjetoMetodo;

import javax.swing.JOptionPane;

public class PruebaEmpleado {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Nombre del empleado 1:");
        String apellido1 = JOptionPane.showInputDialog("Apellido del empleado 1:");
        double salario1 = Double.parseDouble(
                JOptionPane.showInputDialog("Salario mensual del empleado 1:")
        );

        String nombre2 = JOptionPane.showInputDialog("Nombre del empleado 2:");
        String apellido2 = JOptionPane.showInputDialog("Apellido del empleado 2:");
        double salario2 = Double.parseDouble(
                JOptionPane.showInputDialog("Salario mensual del empleado 2:")
        );

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        String mensaje = "SALARIOS ANUALES INICIALES\n\n";

        mensaje += emp1.getNombre() + " " + emp1.getApellidoPaterno()
                + ": $" + (emp1.getSalarioMensual() * 12) + "\n";

        mensaje += emp2.getNombre() + " " + emp2.getApellidoPaterno()
                + ": $" + (emp2.getSalarioMensual() * 12) + "\n\n";

        emp1.setSalarioMensual(emp1.getSalarioMensual() * 1.10);
        emp2.setSalarioMensual(emp2.getSalarioMensual() * 1.10);

        mensaje += "SALARIOS CON AUMENTO DEL 10%\n\n";

        mensaje += emp1.getNombre() + " " + emp1.getApellidoPaterno()
                + ": $" + (emp1.getSalarioMensual() * 12) + "\n";

        mensaje += emp2.getNombre() + " " + emp2.getApellidoPaterno()
                + ": $" + (emp2.getSalarioMensual() * 12);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
