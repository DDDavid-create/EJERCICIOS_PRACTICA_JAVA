package P6;

import javax.swing.*;

public class E2 {
    public static void main(String[] arg){
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion:\n\n 0.SALIR \n1.Saludo \n2.Despedida \n\nElige una opcion por favor"));

            switch (opcion){
                case 1: JOptionPane.showMessageDialog(null, "Holaaa"); break;
                case 2: JOptionPane.showMessageDialog(null, "Ayioss"); break;
                default: break;
            }
        }while (opcion!=0);
        JOptionPane.showMessageDialog(null, "VUELVE PRONTO");
    }
}
