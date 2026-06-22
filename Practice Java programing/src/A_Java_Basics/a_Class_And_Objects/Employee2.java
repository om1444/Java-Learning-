package A_Java_Basics.a_Class_And_Objects;

//5) Create 2 objects of Employee and show different data using display() method.

public class Employee2 {
    String name;
    int empId;
    int empNo;
    double salary;
    String department;

    void display() {
        System.out.println("Employee Name       : " + name);
        System.out.println("Employee ID         : " + empId);
        System.out.println("Employee Number     : " + empNo);
        System.out.println("Employee Salary     : " + salary);
        System.out.println("Employee Department : " + department);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Om";
        e1.empId = 1444;
        e1.empNo = 1111;
        e1.salary = 200000;
        e1.department = "IT";

        Employee e2 = new Employee();
        e2.name = "Rahul";
        e2.empId = 1555;
        e2.empNo = 2222;
        e2.salary = 150000;
        e2.department = "HR";

        e1.display();
        System.out.println("===========================================================");
        e2.display();
    }
}
