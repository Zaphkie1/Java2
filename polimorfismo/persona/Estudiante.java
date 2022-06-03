package polimorfismo.persona;

public class Estudiante extends Persona{
	String escuela;
	String carrera;
	double promedio;
	String matricula;
	String correo;
	public Estudiante(String nombre, String apellido, int edad, String sexo, double peso, double altura,
			String direccion, String escuela, String carrera, double promedio, String matricula, String correo) {
		super(nombre, apellido, edad, sexo, peso, altura, direccion);
		this.escuela = escuela;
		this.carrera = carrera;
		this.promedio = promedio;
		this.matricula = matricula;
		this.correo = correo;
	}
	public String getEscuela() {
		return escuela;
	}
	public String getCarrera() {
		return carrera;
	}
	public double getPromedio() {
		return promedio;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getCorreo() {
		return correo;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	

}
