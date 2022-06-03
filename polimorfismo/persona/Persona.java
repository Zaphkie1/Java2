package polimorfismo.persona;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	String sexo;
	double peso;
	double altura;
	String direccion;
	public Persona(String nombre, String apellido, int edad, String sexo, double peso, double altura,
			String direccion) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getSexo() {
		return sexo;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
