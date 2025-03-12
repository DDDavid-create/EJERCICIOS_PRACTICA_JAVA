package P3;

import javax.swing.*;

public class E3 {
    public static void main(String[] arg){
        int calificacion;

        calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificación (1-100)"));

        if (calificacion>=70){
            JOptionPane.showMessageDialog(null, "GANASTE");
        }else {
            JOptionPane.showMessageDialog(null, "PERDISTE");
        }

    }
}
