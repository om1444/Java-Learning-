package A_Java_Basics.a_Class_And_Objects;

//Create a class Laptop with brand, price, ram.

public class Laptop {
    String brand;
    int price;
    int ram;

    public static void main(String[] args) {
        Laptop l1=new Laptop();

        l1.brand="Lenovo";
        l1.price=56700;
        l1.ram=16;


        System.out.println("Laptop brand name is "+l1.brand);
        System.out.println("Laptop price is "+l1.price);
        System.out.println("Laptop Ram is "+l1.ram);
    }
}
