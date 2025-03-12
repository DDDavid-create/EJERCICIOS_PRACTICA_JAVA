package P5;

import javax.swing.JOptionPane;

public class E1{
    public static void main(String[] args) {
        int n = -1;

        while (n<0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero positivo"));
            if (n>0){
                JOptionPane.showMessageDialog(null, "Gracias");
                n=1;
            }else {
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }

    }
}
