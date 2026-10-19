package EjerciciosGuiadosS3;

public class MainMotor {

    public static void main(String[] args) {

        Motor motor = new Motor("Motor Industrial");

        motor.encender();
        motor.ajustarVelocidad(120);

        motor.mostrarEstado();
    }
}
