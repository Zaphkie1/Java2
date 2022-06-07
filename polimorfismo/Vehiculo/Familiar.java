package polimorfismo.Vehiculo;

public class Familiar extends Vehiculo {
    int puertas;

    public Familiar(String matricula, String marca, String modelo,int puertas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}