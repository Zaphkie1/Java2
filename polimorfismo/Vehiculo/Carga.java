package polimorfismo.Vehiculo;

public class Carga extends Vehiculo{
    int Capacidad;
    String departamento;

    public Carga(String matricula, String marca, String modelo, int Capacidad, String departamento) {
        super(matricula, marca, modelo);
        this.Capacidad = Capacidad;
        this.departamento = departamento;
    }

    public int getCapacidad() {
        return this.Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
