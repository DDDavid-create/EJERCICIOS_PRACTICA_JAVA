package P5;

import javax.swing.*;

public class E3 {
    public static void main(String[] arg){
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero para empezar el conteo regresiva"));

        while (num >= 0){
            JOptionPane.showMessageDialog(null, "Cuenta: " + num);
            num--;
        }
        JOptionPane.showMessageDialog(null, "Finalizó!!");
    }
}
