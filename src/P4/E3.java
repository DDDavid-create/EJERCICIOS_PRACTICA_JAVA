package P4;

import javax.swing.*;

public class E3 {
    public static void main(String[] args) {
        double monto;
        double descuento;

        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la compra"));
        if (monto >= 1000) {
            descuento = monto * 0.20;
            JOptionPane.showMessageDialog(null, "Descuento aplicado: 20%");
        } else if (monto >= 500) {
            descuento = monto * 0.10;
            JOptionPane.showMessageDialog(null, "Descuento aplicado: 10%");
        } else {
            descuento = monto * 0.05;
            JOptionPane.showMessageDialog(null, "Descuento aplicao del 5%");
        }

        double montoFinal = monto - descuento;
        JOptionPane.showMessageDialog(null, "Total a pagar: " + montoFinal);
    }
}
