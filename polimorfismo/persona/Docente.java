package polimorfismo.persona;

public class Docente extends Persona{
	String materia;
	String tipo;
	String experiencia;
	public Docente(String nombre, String apellido, int edad, String sexo, double peso, double altura, String direccion,
			String materia, String tipo, String experiencia) {
		super(nombre, apellido, edad, sexo, peso, altura, direccion);
		this.materia = materia;
		this.tipo = tipo;
		this.experiencia = experiencia;
	}
	public String getMateria() {
		return materia;
	}
	public String getTipo() {
		return tipo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	

}
