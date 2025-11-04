import java.util.Scanner;
class inputScanner{
    Scanner sc = new Scanner(System.in);
}

abstract class shape extends inputScanner{
    int dim1, dim2;
    abstract void input();
    abstract void printArea();
}
class rectangle extends shape{
    void input(){
        System.out.println("Enter length, breadth:");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
    }
    void printArea(){
        double area;
        area = (double) dim1*dim2;
        System.out.println("Area of Rectangle: " +area);
    }
}
class triangle extends shape{
    void input(){
        System.out.println("Enter base, height:");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
    }
    void printArea(){
        double area;
        area = (double) 0.5*dim1*dim2;
        System.out.println("Area of Triangle: " +area);
    }
}
class circle extends shape{
    void input(){
        System.out.println("Enter radius:");
        dim1 = sc.nextInt();
    }
    void printArea(){
        double area;
        area = (double) 3.14*dim1*dim1;
        System.out.println("Area of Circle: " +area);
    }
}

public class Mainclass{
    public static void main(String args[]){
        rectangle r = new rectangle();
        r.input();
        triangle t = new triangle();
        t.input();
        circle c = new circle();
        c.input();
        r.printArea();
        t.printArea();
        c.printArea();
    }
}