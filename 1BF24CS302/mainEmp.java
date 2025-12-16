class Employee{
    protected String name;
    protected int age, Empid, PAN;
    protected double basic;
    public Employee(int Empid, String name, int age, int PAN, double basic){
        this.Empid = Empid;
        this .name = name;
        this.age = age;
        this.PAN = PAN;
        this.basic = basic;

    }
    public void calculateSalary(){
        double DA = 0.04*basic;
        double HRA = 0.02*basic;
        double CCA = 250;
        double PF = 0.01*basic;
        double PT = 100;
        double grossIncome = basic+DA+HRA+CCA;
        double IT = 0.01*grossIncome;
        double deductions = PF+PT+IT;
        double netIncome = grossIncome-deductions;
        System.out.println("Net Income: "+netIncome);
    }

    
    public void display(){
        System.out.println("Employee Details:");
        System.out.println("Employee ID: "+Empid);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary:");
        calculateSalary();

    }
}
class mainEmp{
    public static void main(String[] args) {
        Employee arr[] = new Employee[5];
       
            
        for (int i=0; i<5; i++){
            arr[0] = new Employee(101, "Rahul", 23, 123456, 20000.0);
            arr[1] = new Employee(102, "Raju", 24, 327986, 30000.0);
            arr[2] = new Employee(103, "Ravi", 30, 968432, 60000.0);
            arr[3] = new Employee(104, "Alice", 20, 245698, 50000.0);
            arr[4] = new Employee(105, "Bob", 26, 456989, 35000.0);

        }
        for(int i=0;i<5;i++){
            arr[i].display();
        }

        
    }
}