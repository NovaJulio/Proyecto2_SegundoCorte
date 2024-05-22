package proyecto2_segundocorte;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Proyecto2_SegundoCorte {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        list p = new list();
        p.addChildToEnd("1", "Hola", "Primero", "Hombre", 5);
        System.out.println("1");
        p.addChildToEnd("2", "Ja", "Segundo", "fem", 5);
        System.out.println("2");
        p.addChildToEnd("3", "Loz", "Cuarto", "fem", 5);
        System.out.println("3");
        p.addChildToEnd("4", "Cart", "Quinto", "Hombre", 5);
        System.out.println("4");
        p.printTxt();
        
    }
    
}