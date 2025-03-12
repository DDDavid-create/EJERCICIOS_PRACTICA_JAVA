package P7;

import javax.swing.*;

public class E1 {
    public static void main(String[] arg){
        int tabla, num, res;

        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tabla"));
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de resultados"));
        for (int i=1; i<=num; i++){
            res = tabla*i;
            JOptionPane.showMessageDialog(null, tabla + " x " + i + " = " + res);
        }
    }
}
