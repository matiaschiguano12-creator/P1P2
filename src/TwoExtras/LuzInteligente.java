package TwoExtras;

public class LuzInteligente {

    private boolean encendida;
    private int brillo;

    public LuzInteligente(boolean encendida, int brillo) {
        this.encendida = encendida;
        this.brillo = brillo;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void aumentarBrillo() {
        brillo = brillo + 10;
    }
}