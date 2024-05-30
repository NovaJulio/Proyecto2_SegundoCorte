package proyecto2_segundocorte;
public class jardin {
    String Id;
    String Name;
    String Gender;
    String Grade;
    int Age;
    jardin next;
    jardin prev;
    
    public jardin(String Id, String Name, String Gender, String Grade, int Age){
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.Grade = Grade;
        this.Age = Age;
    }
    
    @Override
    public String toString(){
        return Name + " | " + Gender + " | " + Age + " años";
    }
}