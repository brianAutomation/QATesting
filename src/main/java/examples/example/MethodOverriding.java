package examples.example;
//OOP Concept
//Polymorphism??
//it means = has many forms, in simple words we can define polymorphism
//as the ability to change one thing into diff forms or to behave diff
//Compile time Polymorphism
//Run time Polymorphism

//Method overriding
//Method overloading



public class MethodOverriding {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        SavingsAccount account2 = new SavingsAccount(2000,0.05);
        CheckingAccount account3 = new CheckingAccount(2000,1);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();

        System.out.println();

        account1.withdraw(500);
        account2.withdraw(1500);
        account3.withdraw(500);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();
    }

}
class Shape{
    void draw(){
        System.out.println("drawing a Shape");
    }
}

class Oval extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing an Oval");
    }
}

class Sqaure extends Shape{
    @Override //annotation
    void draw(){
        System.out.println("Drawing a Sqaure");
    }
}

class BankAccount{
    protected double balance;
    public BankAccount(double balance){

        this.balance = balance;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("withdraw success: $ " + amount);
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance(){
        System.out.println("current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }

    @Override
    public void displayBalance() {
        System.out.println("savings Account balance: $" + balance);
    }
}

class CheckingAccount extends BankAccount{
    private double interestRate;

    public CheckingAccount(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    @Override
    public void displayBalance() {
        System.out.println("Checking Account balance: $" + balance); /// polymorphism <<<<< edited an inherited property e.g., display method, from parent class
    }

}