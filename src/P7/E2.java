package P7;

import javax.swing.*;

public class E2 {
    public static void main(String[] arg){
        String palabra;
        int cont = 0;

        palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        for (int i = 0; i< palabra.length(); i++){
            cont++;
        }
        JOptionPane.showMessageDialog(null, "La palabra '" + palabra + "' tiene: "+ cont + " letras");
    }
}
