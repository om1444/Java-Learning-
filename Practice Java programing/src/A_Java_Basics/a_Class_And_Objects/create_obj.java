package A_Java_Basics.a_Class_And_Objects;

//2)Create object and print student details.

public class create_obj {

    String name;
    int rollNo;
    double marks;

    public static void main(String[] args) {

        // Creating Object
        //this is a obj creation step that can create a obj
        create_obj s1 = new create_obj();

        // Assigning values
        s1.name = "Om";
        s1.rollNo = 44;
        s1.marks = 98.99;

        // Printing student details
        System.out.println("Student Name : " + s1.name);
        System.out.println("Student Roll No : " + s1.rollNo);
        System.out.println("Student Marks : " + s1.marks);
    }
}

