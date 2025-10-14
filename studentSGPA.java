import java.util.Scanner;
class Subject{
    int subjectMarks, credits, grade;
}

class Student{
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject subject[];
    Student(){
        s = new Scanner(System.in);
        subject = new Subject[8];
        for (int i=0; i<8; i++){
            subject[i] = new Subject();
        }
    }


void getStudentDetails(){
    System.out.println("Enter Student name:");
    name = s.nextLine();
    System.out.println("Enter Student's USN:");
    usn = s.nextLine();
}

void getMarks(){
    for(int i=0; i<8; i++){
        System.out.println("Enter marks for subject " + (i+1) + ":");
        subject[i].subjectMarks = s.nextInt();
        System.out.println("Enter credits for subject " + (i+1) + ":");
        subject[i].credits = s.nextInt();
        subject[i].grade = (subject[i].subjectMarks/10) + 1;
        if (subject[i].grade == 11){
            subject[i].grade = 10;
        }
        else if (subject[i].grade<=4){
            subject[i].grade = 0;
        }
    }
}

void computeSGPA(){
    int Score =0;
    int totalCredits = 0;
    for (int i=0; i<8; i++){
        Score += (subject[i].grade*subject[i].credits);
        totalCredits += subject[i].credits;
    }
    SGPA = (double)Score/(double)totalCredits;
}

void display(){
    System.out.println("\nStudent Details:");
    System.out.println("Name:" + name);
    System.out.println("USN:" + usn);
    System.out.printf("SGPA: %2f\n",SGPA);
}
}

class studentSGPA{
    public static void main (String args[]){
        for (int i=0; i<2; i++){
            Student student = new Student();
            student.getStudentDetails();
            student.getMarks();
            student.computeSGPA();
            student.display();
        }
    }
}