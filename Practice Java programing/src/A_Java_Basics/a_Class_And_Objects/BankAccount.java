package A_Java_Basics.a_Class_And_Objects;

//    7)Create a class BankAccount with deposit and withdraw methods.
public class BankAccount {

    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount : " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn Amount : " + amount);
    }

    void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.accountHolder = "Om";
        b1.balance = 10000;

        b1.deposit(5000);
        b1.withdraw(2000);

        b1.display();
    }
}
