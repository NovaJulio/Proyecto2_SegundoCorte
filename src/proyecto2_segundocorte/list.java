package proyecto2_segundocorte;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class list {

    jardin fChild;

    public list() {
        fChild = null;
    }

    public jardin getultimo() {
        jardin j = fChild;
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
            do {
                if (j.Id.equals(st)) {
                    return null;
                } else {
                    j = j.next;
                }
            } while (j.next != fChild);
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

    public jardin createnodo(String i, String n,
            String gr, String ge, int a) {
        jardin search = null;
        if (i.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el id", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (n.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        try {
            search = searchid(i);
            if (search != null) {
                JOptionPane.showMessageDialog(null,
                        "Este registro civil ya se encuentra registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            } else {
                jardin info = new jardin(i, n, ge, gr, a);
                return info;
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "" + e);
            return null;
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

    public void addChildToEnd(
            String i,
            String n,
            String gr,
            String ge,
            int a) {
        jardin p = fChild;
        jardin info = createnodo(i, n, gr, ge, a);
        jardin ult = getultimo();
        if (info != null) {
            if (fChild == null) {
                fChild = info;
                fChild.next = fChild;
                fChild.prev = fChild;
            } else if (ult == fChild) {
                fChild.next = info;
                fChild.prev = info;
                info.next = fChild;
                info.prev = fChild;
            } else {
                ult.next = info;
                info.prev = ult;
                info.next = fChild;
                fChild.prev = info;
            }
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
    File content = new File("reg.txt");

    public void printTxt() throws FileNotFoundException, UnsupportedEncodingException {
        jardin p = fChild;

        try {
            if (content.createNewFile()) {
                try (PrintWriter w = new PrintWriter("reg.txt", "UTF-8")) {
                    if (empty()) {
                        w.println("Registro vacio");
                        return;
                    }
                    w.println("<Registro>");
                    int i = 1;
                    do {
                        w.println("\t<Elemento n°" + i + ">");
                        w.println("\t\tId:" + p.Id);
                        w.println("\t\tName:" + p.Name);
                        w.println("\t\tGender:" + p.Gender);
                        w.println("\t\tGrade:" + p.Grade);
                        w.println("\t\tAge:" + p.Age);
                        w.println("\t</Elemento n°" + i + ">");
                        p = p.next;
                        i++;
                    } while (p != fChild);
                    w.println("</Registro>");
                }
            } else {
                try (PrintWriter w = new PrintWriter("reg.txt", "UTF-8")) {
                    if (empty()) {
                        w.println("Registro vacio");
                        return;
                    }
                    w.println("<Registro>");
                    int i = 1;
                    do {
                        w.println("\t<Elemento n°" + i + ">");
                        w.println("\t\tId:" + p.Id);
                        w.println("\t\tName:" + p.Name);
                        w.println("\t\tGender:" + p.Gender);
                        w.println("\t\tGrade:" + p.Grade);
                        w.println("\t\tAge:" + p.Age);
                        w.println("\t</Elemento n°" + i + ">");
                        p = p.next;
                        i++;
                    } while (p != fChild);
                    w.println("</Registro>");
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    
}
