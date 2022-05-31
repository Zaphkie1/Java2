package Polimorfismo.Persona;

import javax.swing.JOptionPane;

public class Menu {
    public void Menu() {
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Estudiante\n"
                    + "2.-Salir\n", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
            switch (opc) {
                case 1:
                    break;
                case 2:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opc != 2);
    }
}