package A_Java_Basics.a_Class_And_Objects;

//1)Create a class Student with variables name, rollNo, marks.

public class Student {
    String name;
    int rollNo;
    double marks;

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "om";
        s.rollNo = 44;
        s.marks = 98.99;

        System.out.println("Student Name is " + s.name);
        System.out.println("Student Roll No. is -" + s.rollNo);
        System.out.println("Student Marks are Obtain is " + s.marks);
    }
}
