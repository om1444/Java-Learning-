package A_Java_Basics.a_Class_And_Objects;

    //4)Create a class Employee with method display() to print details

public class Employee {
    String name;
    int empId;
    int empNo;
    double salary;
    String department;

    void display(){
        System.out.println("Employee name:- "+name);
        System.out.println("Employee Id:- "+empId);
        System.out.println("Employee number:- "+empNo);
        System.out.println("Employee salary:- "+salary);
        System.out.println("Employee department :- "+department);

    }

    public static void main(String[] args) {
        Employee e1=new Employee();

        e1.name="Om";
        e1.empId=1444;
        e1.empNo=1111;
        e1.salary=200000;
        e1.department="IT";


        e1.display();

    }
}
