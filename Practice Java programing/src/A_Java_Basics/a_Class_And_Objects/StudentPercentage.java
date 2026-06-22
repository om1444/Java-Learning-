package A_Java_Basics.a_Class_And_Objects;

public class StudentPercentage {
    String name;
    int sub1, sub2, sub3, sub4, sub5;

    void calculatePercentage(){
        int total=sub1+sub2+sub3+sub4+sub5;
        double percentage=(total/500.0)*100;

        System.out.println("Student Name:"+name);
        System.out.println("Total marks :"+total);
        System.out.println("Percentage :"+percentage+"%");
    }
    public static void main(String [] args){
        StudentPercentage s1=new StudentPercentage();

        s1.name="Om";
        s1.sub1=80;
        s1.sub2=85;
        s1.sub3=90;
        s1.sub4=88;
        s1.sub5=92;

        s1.calculatePercentage();
    }
}
