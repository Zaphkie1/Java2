package polimorfismo.persona;

public class Imprime {
	public String imprimeEstudiante(Estudiante p) {
		return p.getNombre() + "\t" +
				p.getApellido() + "\t" +
				p.getDireccion() + "\t" +
				p.getSexo() + "\t" +
				p.getEscuela() + "\t" +
				p.getCarrera() + "\t" +
				p.getMatricula() + "\t" +
				p.getCorreo() + "\t" +
				p.getEdad() + "\t" +
				p.getPeso() + "\t" +
				p.getAltura() + "\t" +
				p.getPromedio() + "\n";

	}

	public String imprimeDocente(Docente t) {
		return "nombre" + t.getNombre() + "\t" +
				"apellido: " + t.getApellido() + "\t" +
				"edad: " + t.getEdad() + "\t" +
				"sexo" + t.getSexo() + "\t" +
				"peso" + t.getPeso() + "\t" +
				"altura" + t.getAltura() + "\t" +
				"direccion" + t.getDireccion() + "\n" +
				"materia" + t.getMateria() + "\t" +
				"tipo" + t.getTipo() + "\t" +
				"experiencia" + t.getExperiencia() + "\n";

	}

	public String imprimeIntendente(Intendente n)

	{
		return "nombre" + n.getNombre() + "\t" +
				"apellido: " + n.getApellido() + "\t" +
				"edad: " + n.getEdad() + "\t" +
				"sexo" + n.getSexo() + "\t" +
				"peso" + n.getPeso() + "\t" +
				"altura" + n.getAltura() + "\t" +
				"direccion" + n.getDireccion() + "\t" +
				"Area" + n.getArea() + "\t" +
				"Sueldo" + n.getSueldo() + "\t" +
				"Intitucion" + n.getInstitucion()+ "\n";
	}

	public String imprimeAdministrativo(Administrativo d) {
		return "nombre" + d.getNombre() + "\t" +
				"apellido: " + d.getApellido() + "\t" +
				"edad: " + d.getEdad() + "\t" +
				"sexo" + d.getSexo() + "\t" +
				"peso" + d.getPeso() + "\t" +
				"altura" + d.getAltura() + "\t" +
				"direccion" + d.getDireccion() + "\t" +
				"Puesto" + d.getPuesto() + "\t" +
				"Años" + d.getAños() + "\t" +
				"Edificio" + d.getEdificio()+ "\n";
	}

}
