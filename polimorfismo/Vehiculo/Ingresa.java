package polimorfismo.Vehiculo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.xml.validation.Validator;

public class Ingresa {
    JTextArea salida = new JTextArea();
    String datosE="Matricula\tMarca\tModelo\tCilindros";
    String tmp="";
    Imprime i = new Imprime();
    public void ingresaDeportivo() {
    String mat,mar,mod;
    int cil;
    mat=JOptionPane.showInputDialog(null, "Ingrese la matricula: ","Matricula");
    mar=JOptionPane.showInputDialog(null, "Ingrese la marca: ","Marca");
    mod=JOptionPane.showInputDialog(null, "Ingrese el modelo: ","Modelo");
    cil=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cilindros: ","Cilindros"));
    //aplicando polimorfismo
		Vehiculo d = new Deportivo(matricula, marca, modelo, cilindros);
		//envio de estudiante
		tmp=i.imprimeDeportivo((Deportivo)d);
		datosE+=tmp;
		salida.setText(datosE);//guarda en JTextArea
		JOptionPane.showMessageDialog(null, salida,
		"datos de Vehiculo",JOptionPane.INFORMATION_MESSAGE);
    }
}
