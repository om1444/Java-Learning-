package A_Java_Basics.a_Class_And_Objects;

public class Car {

    String brand;

    void start() {
        System.out.println(brand + " Car Started");
    }

    void stop() {
        System.out.println(brand + " Car Stopped");
    }

    void accelerate() {
        System.out.println(brand + " Car is Accelerating");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Honda";

        c1.start();
        c1.accelerate();
        c1.stop();

        System.out.println("=============================================");

        Car c2 = new Car();

        c2.brand="BMW";

        c2.start();
        c2.stop();
        c2.accelerate();
    }
}