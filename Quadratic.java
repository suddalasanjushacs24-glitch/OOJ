import java.util.Scanner;

class Quadratic{
    public static void main(String args[]){
        float a,b,c,d;
        double r1,r2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coefficients a,b,c:");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        if (a==0){
            System.out.println("It is not an Quadratic Equation.");
            System.out.println("Enter the non-zero value of a:");
            a = in.nextFloat();
        }
        d = b*b - 4*a*c;
        if (d==0){
            System.out.println("The roots are Real and Equal.");
            r1 = r2 = (-b)/(2*a);
            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        }
        else if (d>0){
            System.out.println("The roots are Real and Distinct.");
            r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
            r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        }
        else if (d<0){
            System.out.println("The roots are Imaginary.");
            r1 = (-b)/(2*a);
            r2 = (Math.sqrt(-d))/(2*a);
            System.out.println("r1 = "+r1 + "+i" + r2);
            System.out.println("r2 = "+r1 + "-i" + r2);
        }

    }
}