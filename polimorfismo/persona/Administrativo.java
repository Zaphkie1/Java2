package polimorfismo.persona;

public class Administrativo extends Persona {
	
	String puesto;
	String años;
	String edificio;
	public Administrativo(String nombre, String apellido, int edad, String sexo, double peso, double altura,
			String direccion, String puesto, String años, String edificio) {
		super(nombre, apellido, edad, sexo, peso, altura, direccion);
		this.puesto = puesto;
		this.años = años;
		this.edificio = edificio;
	}
	public String getPuesto() {
		return puesto;
	}
	public String getAños() {
		return años;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public void setAños(String años) {
		this.años = años;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	
	
	
	

}
