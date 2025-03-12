package P7;

import javax.swing.*;

public class E3 {
    public static void main(String[] arg){
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta cuanto quiere contar"));

        for (int i=0; i<=num; i++){
            JOptionPane.showMessageDialog(null, "Contador: " + i);
        }
    }
}
