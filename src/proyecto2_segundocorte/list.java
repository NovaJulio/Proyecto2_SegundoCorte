package proyecto2_segundocorte;

import java.awt.HeadlessException;
import javax.swing.*;

public class list {

    jardin fChild;

    public list() {
        fChild = null;
    }
    
    public jardin getultimo(){
        jardin j;
        if(fChild == null){
            return null;
        } else{
            j = fChild;
            while(j.next != fChild){
                j = j.next;
            }
            return j;
        }
    }

    public jardin searchid(String st) {
        if (fChild == null) {
            return null;
        } else {
            jardin j = fChild;
            while (j != null) {
                if (j.Id.equals(st)) {
                    return null;
                } else {
                    j = j.next;
                }
            }
            return null;
        }
    }
    
    public jardin createnodo(JTextField i, JTextField n,
            JComboBox ge, JComboBox gr, JSlider a){
        jardin search = null;
        if (i.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            n.requestFocus();
            return null;
        }
        if (n.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            n.requestFocus();
            return null;
        }
        if (ge.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Elija un genero valido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (gr.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Elija un grado valido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        try {
            search = searchid(i.getText());
            if (search != null) {
                JOptionPane.showMessageDialog(null,
                        "Este registro civil ya se encuentra registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                i.setText("");
                i.requestFocus();
                return null;
            } else {
                jardin info = new jardin(i.getText(), n.getText(), ge.getSelectedItem().toString(), gr.getSelectedItem().toString(), a.getValue());
                return info;
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "" + e);
            return null;
        }
    }
}