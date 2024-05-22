package proyecto2_segundocorte;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.swing.*;

public class list {

    jardin fChild;

    public list() {
        fChild = null;
    }

    public jardin getultimo() {
        jardin j;
        if (fChild == null) {
            return null;
        } else {
            j = fChild;
            while (j.next != fChild) {
                j = j.next;
            }
            return j;
        }
    }

    public boolean empty() {
        return fChild == null;
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
            JComboBox ge, JComboBox gr, JSlider a) {
        jardin search = null;
        if (i.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el id", "Error", JOptionPane.ERROR_MESSAGE);
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

    public void printTxt() throws FileNotFoundException, UnsupportedEncodingException {
        jardin p = fChild;
        File content = new File("user.dir");
        try {
            content.createNewFile();
        } catch (IOException e) {
        }
    }

    public void addChildToEnd(
            JTextField i,
            JTextField n,
            JComboBox gr,
            JComboBox ge,
            JSlider a) {
        jardin p = fChild;
        jardin info = createnodo(i, n, gr, ge, a);
        if (info != null) {
            if (p == null) {
                fChild = info;
            } else {
                jardin ult = getultimo();
                ult.next = info;
                info.prev = ult;
                p.prev = info;
                info.next = p;
            }
            i.setText("");
            n.setText("");
            gr.setSelectedIndex(0);
            ge.setSelectedIndex(0);
            i.grabFocus();
        }
    }

    public jardin Delete(jardin i) {
        jardin u = getultimo();
        if (i == fChild) {
            fChild = i.next;    
            u.next = fChild;
            fChild.prev = u;
            return fChild;
        } else if (getultimo() == i) {
            i.prev.next = fChild;
            fChild.prev = i.prev.next;
            return null;
        } else {
            jardin a = i.prev;
            jardin b = i.next;
            a.next = b;
            b.prev = a;
            return b;
        }
    }

}