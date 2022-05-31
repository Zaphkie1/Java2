package Polimorfismo.Persona;

import javax.swing.JOptionPane;

public class Ingresa {
    Imprime i = new Imprime;
    public void ingresaEstudiatnte() {
        String nom, ape, dir, sex, esc, carr, mat, corr;
        int edad;
        double pes, alt, prom;

        nom = JOptionPane.showInputDialog(null, "Nombre: ", "Ingresa nombre", JOptionPane.QUESTION_MESSAGE);
        ape = JOptionPane.showInputDialog(null, "Apelllido: ", "Ingresa Apellido", JOptionPane.QUESTION_MESSAGE);
        dir = JOptionPane.showInputDialog(null, "Direccion: ", "Ingresa Direccion", JOptionPane.QUESTION_MESSAGE);
        sex = JOptionPane.showInputDialog(null, "Sexo: ", "Ingresa Sexo", JOptionPane.QUESTION_MESSAGE);
        esc = JOptionPane.showInputDialog(null, "Escuela: ", "Ingresa Escuela", JOptionPane.QUESTION_MESSAGE);
        carr = JOptionPane.showInputDialog(null, "Carrera: ", "Ingresa Carrera", JOptionPane.QUESTION_MESSAGE);
        mat = JOptionPane.showInputDialog(null, "Matricula: ", "Ingresa Matricula", JOptionPane.QUESTION_MESSAGE);
        corr = JOptionPane.showInputDialog(null, "Correo: ", "Ingresa Correo", JOptionPane.QUESTION_MESSAGE);
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad: ","Ingresa Edad",JOptionPane.QUESTION_MESSAGE));
        pes=Double.parseDouble(JOptionPane.showInputDialog(null, "Peso: ","Ingresa peso",JOptionPane.QUESTION_MESSAGE));
        alt=Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: ","Ingresa altura",JOptionPane.QUESTION_MESSAGE));
        prom=Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio: ","Ingresa promedio",JOptionPane.QUESTION_MESSAGE));
        //!Aplicacion de Polimorfismo
        Persona e = new Estudiante(nom,ape,edad,sex,pes,alt,dir,esc,carr,prom,mat,corr);
        JOptionPane.showMessageDialog(null, i.imprimeEstudiante(e));
    }
}
