import java.util.Scanner;

class wrongAge extends Exception{
    public wrongAge(){
        super("Age Error");
    }
    public wrongAge(String message){
        super(message);
    }
}

class inputScanner{
    protected static final Scanner s = new Scanner(System.in);
}

class father extends inputScanner{
    int fatherAge;
    public father() throws wrongAge{
        System.out.println("Enter father age:");
        fatherAge = inputScanner.s.nextInt();
        if (fatherAge < 0){
            throw new wrongAge("Age cannot be negative");
        }
    }
    public void display(){
        System.out.println("Father's age:"+fatherAge);
    }
}

class son extends father{
    int sonAge;
    public son() throws wrongAge{
        super();
        System.out.println("Enter son age:");
        sonAge = inputScanner.s.nextInt();
        if (sonAge >= fatherAge){
            throw new wrongAge("Son's age cannot be greater or equal to father's age");
        }
        else if (sonAge < 0){
            throw new wrongAge("Age cannot be negative");
        }
    }
    public void display(){
        super.display();
        System.out.println("Son's age:"+sonAge);
    }
}
public class Ageexception {
    public static void main(String[] args) {
        try {
            son Son = new son();
            Son.display();
        } 
        catch (wrongAge e){
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
