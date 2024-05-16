package proyecto2_segundocorte;

public class list {

    jardin fChild;

    public list() {
        fChild = null;
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
    
    

}
