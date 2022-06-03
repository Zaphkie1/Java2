package polimorfismo.persona;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	JTextArea salida = new JTextArea();
	String datosE="Nombre\tApellido\tDireccion\tSexo\tEscuela"+
	"Carrera\tMatricula\tCorreo\tEdad\tPeso\t"
			+"Altura\tPromedio\n";
	String tmp="";
	Imprime i = new Imprime();
	public void ingresaEstudiante()
	{
		String nom,ape,dir,sex,esc,carr,mat,corr;
		int edad;
		double peso, alt, prom;
		nom=JOptionPane.showInputDialog(null," nombre ", "ingrese el nombre",
				JOptionPane.INFORMATION_MESSAGE);
		ape=JOptionPane.showInputDialog(null," Apellido ", "ingrese el apellido",
				JOptionPane.INFORMATION_MESSAGE);
		dir=JOptionPane.showInputDialog(null," Direccion ", "ingrese la direccion",
				JOptionPane.INFORMATION_MESSAGE);
		sex=JOptionPane.showInputDialog(null," sexo ", "ingrese el sexo",
				JOptionPane.INFORMATION_MESSAGE);
		esc=JOptionPane.showInputDialog(null," Escuela ", "ingrese el nombre de la ecuela",
				JOptionPane.INFORMATION_MESSAGE);
		carr=JOptionPane.showInputDialog(null," nombre del carro ", "ingrese el nombre del carro",
				JOptionPane.INFORMATION_MESSAGE);
		mat=JOptionPane.showInputDialog(null," Matricula ", "ingrese Matricula",
				JOptionPane.INFORMATION_MESSAGE);
		corr=JOptionPane.showInputDialog(null," Correo", "ingrese el correo",
				JOptionPane.INFORMATION_MESSAGE);
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad","ingrese la edad",
				JOptionPane.INFORMATION_MESSAGE));
		peso=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Peso","Ingrese el peso",JOptionPane.INFORMATION_MESSAGE));
		alt=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Altura","Ingrese altura",JOptionPane.INFORMATION_MESSAGE));
		prom=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Prom","Ingrese el Promedio",JOptionPane.INFORMATION_MESSAGE));
		
		//aplicando polimorfismo
		Persona e = new Estudiante (nom, ape, edad, sex, peso,alt, dir,esc,carr,prom,mat,corr );
		//envio de estudiante
		tmp=i.imprimeEstudiante((Estudiante)e);
		datosE+=tmp;
		salida.setText(datosE);//guarda en JTextArea
		JOptionPane.showMessageDialog(null, salida,
		"datos de estudiante",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ingresaDocente()
	{
		String nom,ape;
		int edad;
		String sexo;
		double peso, alt;
		String dir;
		String mate,tip,exp;
		
		nom=JOptionPane.showInputDialog(null," nombre ", "ingrese el nombre",
				JOptionPane.INFORMATION_MESSAGE);
		ape=JOptionPane.showInputDialog(null," Apellido ", "ingrese el apellido",
				JOptionPane.INFORMATION_MESSAGE);
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad","ingrese la edad",
				JOptionPane.INFORMATION_MESSAGE));
		sexo=JOptionPane.showInputDialog(null," sexo ", "ingrese el sexo",
				JOptionPane.INFORMATION_MESSAGE);
		peso=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Peso","Ingrese el peso",JOptionPane.INFORMATION_MESSAGE));
		alt=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Altura","Ingrese altura",JOptionPane.INFORMATION_MESSAGE));
		dir=JOptionPane.showInputDialog(null," Direccion ", "ingrese la direccion",
				JOptionPane.INFORMATION_MESSAGE);
		mate=JOptionPane.showInputDialog(null," Materia ", "ingrese Materia",
				JOptionPane.INFORMATION_MESSAGE);
		tip=JOptionPane.showInputDialog(null," Tipo de intitucion ", "ingrese el tipo",
				JOptionPane.INFORMATION_MESSAGE);
		exp=JOptionPane.showInputDialog(null," Experiencia ", "ingrese Experiencia",
				JOptionPane.INFORMATION_MESSAGE);
		
		Persona e = new Docente(nom, ape, edad, sexo, peso, alt, dir, mate, tip, exp);
		JOptionPane.showMessageDialog(null, i.imprimeDocente((Docente)e),
				"datos de Docente",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	public void ingresaIntendente()
	{
		String nom,ape;
		int edad;
		String sexo;
		double peso, alt;
		String dir;
		String area;
		double sueldo;
		String institucion;
		
		nom=JOptionPane.showInputDialog(null," nombre ", "ingrese el nombre",
				JOptionPane.INFORMATION_MESSAGE);
		ape=JOptionPane.showInputDialog(null," Apellido ", "ingrese el apellido",
				JOptionPane.INFORMATION_MESSAGE);
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad","ingrese la edad",
				JOptionPane.INFORMATION_MESSAGE));
		sexo=JOptionPane.showInputDialog(null," sexo ", "ingrese el sexo",
				JOptionPane.INFORMATION_MESSAGE);
		peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Peso","Ingrese el peso"
				,JOptionPane.INFORMATION_MESSAGE));
		alt=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Altura","Ingrese altura",JOptionPane.INFORMATION_MESSAGE));
		dir=JOptionPane.showInputDialog(null," Direccion ", "ingrese la direccion",
				JOptionPane.INFORMATION_MESSAGE);
		area=JOptionPane.showInputDialog(null," Area ", "ingrese el area",
				JOptionPane.INFORMATION_MESSAGE);
		sueldo=Double.parseDouble(JOptionPane.showInputDialog(null,"sueldo","Ingrese el sueldo"
				,JOptionPane.INFORMATION_MESSAGE));
		institucion=JOptionPane.showInputDialog(null," institucion ", "ingrese Intituto",
				JOptionPane.INFORMATION_MESSAGE);
		
		Persona e = new Intendente(nom, ape, edad, sexo, peso, alt, dir, area, sueldo, institucion);
		JOptionPane.showMessageDialog(null, i.imprimeIntendente((Intendente)e),
				"datos del Intendente",JOptionPane.INFORMATION_MESSAGE);	
		
	}
	public void ingresaAdministrativo()
	{
		String nom,ape;
		int edad;
		String sexo;
		double peso, alt;
		String dir;
		String pues,años,edi;
		
		nom=JOptionPane.showInputDialog(null," nombre ", "ingrese el nombre",
				JOptionPane.INFORMATION_MESSAGE);
		ape=JOptionPane.showInputDialog(null," Apellido ", "ingrese el apellido",
				JOptionPane.INFORMATION_MESSAGE);
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad","ingrese la edad",
				JOptionPane.INFORMATION_MESSAGE));
		sexo=JOptionPane.showInputDialog(null," sexo ", "ingrese el sexo",
				JOptionPane.INFORMATION_MESSAGE);
		peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Peso","Ingrese el peso"
				,JOptionPane.INFORMATION_MESSAGE));
		alt=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Altura","Ingrese altura",JOptionPane.INFORMATION_MESSAGE));
		dir=JOptionPane.showInputDialog(null," Direccion ", "ingrese la direccion",
				JOptionPane.INFORMATION_MESSAGE);
		pues=JOptionPane.showInputDialog(null," puesto ", "ingrese el puesto",
				JOptionPane.INFORMATION_MESSAGE);
		años=JOptionPane.showInputDialog(null," años ", "ingrese los años",
				JOptionPane.INFORMATION_MESSAGE);
		edi=JOptionPane.showInputDialog(null," edificio ", "ingrese el edificio",
				JOptionPane.INFORMATION_MESSAGE);
		
		Persona e = new Administrativo(nom, ape, edad, sexo, peso, alt, dir, pues, años,edi);
		JOptionPane.showMessageDialog(null, i.imprimeAdministrativo((Administrativo)e),
				"datos de Administrativo",JOptionPane.INFORMATION_MESSAGE);	
		
		
	}

}
