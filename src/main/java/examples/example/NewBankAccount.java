package examples.example;

public class NewBankAccount {

    private String name;
    private int accountNumber;
    private int routingNumber;
    private double balance;

    public NewBankAccount(String name, int accountNumber,int routingNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " deposited, New Balance $: " + balance);
        }else {
            System.out.println("amount deposited must be greater than 0");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn, New Balance $: " + balance);
        }else {
            System.out.println("amount exceeds available balance");
        }
    }

    public void viewDetails(){
        System.out.println("Name: "+ name + " Account Number: " + accountNumber + " Routing Number: " + routingNumber + " Balance: " +balance);
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
