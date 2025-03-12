package P4;

import javax.swing.*;

public class E1 {
    public static void main(String[] args) {
        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        //Condicionales dobles
        if (edad < 13) {
            JOptionPane.showMessageDialog(null, "Eres un/a niño/a");
        } else if (edad >= 13 && edad < 18) {
            JOptionPane.showMessageDialog(null, "Eres un/a adolescente");
        } else if (edad >= 18 && edad < 65) {
            JOptionPane.showMessageDialog(null, "Eres un/a adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un/a adulto mayor");
        }
    }
}
