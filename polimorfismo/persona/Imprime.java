package polimorfismo.persona;

public class Imprime {
	public  String imprimeEstudiante(Estudiante p)
	{
		return p.getNombre()+"\t"+
		p.getApellido()+"\t"+
		p.getDireccion()+"\t"+
		p.getSexo()+"\t"+
		p.getEscuela()+"\t"+
		p.getCarrera()+"\t"+
		p.getMatricula()+"\t"+
		p.getCorreo()+"\t"+
		p.getEdad()+"\t"+
		p.getPeso()+"\t"+
		p.getAltura()+"\t"+
		p.getPromedio()+"\n";
		
		
		
	}
	public String imprimeDocente(Docente t)
	{
		return "nombre"+t.getNombre()+"\n"+
	"apellido: "+t.getApellido()+"\n"+
				"edad: "+t.getEdad()+"\n"+
	"sexo"+t.getSexo()+"\n"+
				"peso"+t.getPeso()+"\n"+
	"altura"+t.getAltura()+"\n"+
				"direccion"+t.getDireccion()+"\n"+
	"materia"+t.getMateria()+"\n"+
				"tipo"+t.getTipo()+"\n"+
	"experiencia"+t.getExperiencia();
				
	}
	public String imprimeIntendente(Intendente n)
	
	{
		return "nombre"+n.getNombre()+"\n"+
				"apellido: "+n.getApellido()+"\n"+
							"edad: "+n.getEdad()+"\n"+
				"sexo"+n.getSexo()+"\n"+
							"peso"+n.getPeso()+"\n"+
				"altura"+n.getAltura()+"\n"+
							"direccion"+n.getDireccion()+"\n"+
				"Area"+n.getArea()+"\n"+
							"Sueldo"+n.getSueldo()+"\n"+
				"Intitucion"+n.getInstitucion();
	}
	public String imprimeAdministrativo(Administrativo d)
	{
		return "nombre"+d.getNombre()+"\n"+
				"apellido: "+d.getApellido()+"\n"+
							"edad: "+d.getEdad()+"\n"+
				"sexo"+d.getSexo()+"\n"+
							"peso"+d.getPeso()+"\n"+
				"altura"+d.getAltura()+"\n"+
							"direccion"+d.getDireccion()+"\n"+
				"Puesto"+d.getPuesto()+"\n"+
							"Años"+d.getAños()+"\n"+
				"Edificio"+d.getEdificio();
	}

}
