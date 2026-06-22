package A_Java_Basics.a_Class_And_Objects;

public class empCalculateSalary {
        String name;
        int empId;
        double salary;
        String department;

        void display() {
            System.out.println("Employee Name       : " + name);
            System.out.println("Employee ID         : " + empId);
            System.out.println("Employee Salary     : " + salary);
            System.out.println("Employee Department : " + department);
        }

        double calculateSalary() {
            return salary;
        }

        public static void main(String[] args) {

            empCalculateSalary e1 = new empCalculateSalary();

            e1.name = "Om";
            e1.empId = 1444;
            e1.salary = 200000;
            e1.department = "IT";

            e1.display();

            System.out.println("Calculated Salary : " + e1.calculateSalary());
        }
}
