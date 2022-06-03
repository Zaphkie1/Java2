package polimorfismo.persona;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa i = new Ingresa();
	
	public void menu()
	
	{
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,
				"1. Estudiante\n"+"2-Docente\n"+"3-Intendente\n"+"4-Administrativo\n"+
		"5-salir\n","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:i.ingresaEstudiante();
			break;
		case 2:i.ingresaDocente();
			break;
		case 3:i.ingresaIntendente();
			break;
		case 4:i.ingresaAdministrativo();
			break;
		case 5:System.exit(0);
		default:JOptionPane.showMessageDialog(null,"opcion invalida","error",
				JOptionPane.ERROR_MESSAGE);
		
		}
	}while(opc !=5);

}}
