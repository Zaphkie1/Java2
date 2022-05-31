package Polimorfismo.Persona;

public class Estudiante extends Persona {
    String escuela, carrera, matricula, correo;
    double promedio;

    public Estudiante(String escuela, String carrera, String matricula, String correo, double promedio) {
        super(nombre, apellido, sexo, direccion, edad, peso, altura);
        this.escuela = escuela;
        this.carrera = carrera;
        this.matricula = matricula;
        this.correo = correo;
        this.promedio = promedio;
    }


    public String getEscuela() {
        return this.escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
