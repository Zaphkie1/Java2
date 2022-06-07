package polimorfismo.Vehiculo;

public class Deportivo extends Vehiculo {
    int cilindros;


    public Deportivo(String matricula, String marca, String modelo,int cilindros) {
        super(matricula, marca, modelo);
        this.cilindros = cilindros;
    }


    public int getCilindros() {
        return this.cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }


}
