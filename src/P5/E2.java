package P5;

import javax.swing.*;

public class E2 {
    public static void main(String[] arg){
        int cont = 1, fin;

        fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta cuanto quiere que el programa cuente"));

        while (cont<=fin){
            JOptionPane.showMessageDialog(null, "Contador: " + cont);
            cont++;
        }
        JOptionPane.showMessageDialog(null, "Hasta aquí llega");
    }
}
