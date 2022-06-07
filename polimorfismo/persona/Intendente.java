package polimorfismo.persona;

public class Intendente extends Persona {
	String area;
	double sueldo;
	String institucion;

	public Intendente(String nombre, String apellido, int edad, String sexo, double peso, double altura,
			String direccion, String area, double sueldo, String institucion) {
		super(nombre, apellido, edad, sexo, peso, altura, direccion);
		this.area = area;
		this.sueldo = sueldo;
		this.institucion = institucion;
	}

	public String getArea() {
		return area;
	}

	public double getSueldo() {
		return sueldo;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

}
