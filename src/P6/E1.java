package P6;

import javax.swing.*;

public class E1 {
    public static void main(String[] arg){
        int intento;
        int n_secreto = 8;

        do {
            intento = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero secreto :D (1-10)"));
            if (intento!=8){
                JOptionPane.showMessageDialog(null, "Nou. Intenta de nuevo");
            }
        }while (intento!=n_secreto);
        JOptionPane.showMessageDialog(null, "¡FELICIDADES! Adivinaste el numero secreto");
    }
}
