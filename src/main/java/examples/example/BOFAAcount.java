package examples.example;

public class BOFAAcount {
    private String Name;
    private int AccountNumber;
    private int RoutingNumber;
    private double Balance;
    public BOFAAcount(String Name, int AccountNumber,int RoutingNumber,double Balance){
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.RoutingNumber = RoutingNumber;
        this.Balance = Balance;
    }
    public void Deposit(double amount){
        if(amount>0){
            Balance += amount; //
            System.out.println(amount+ " deposited, New Balance: $ " + Balance);
        }else {
            System.out.println("deposit amount has to be more than 0");
        }
    }
    public void Withdraw(double amount){
        if(amount> 0 && amount <= Balance){
            Balance -= amount; // balance - amount = new amount
            System.out.println(amount+ " withdrawn, new balance: $ " + Balance);
        }else {
            System.out.println("Can not withdraw more than balance");
        }
    }
    public void viewDetails(){
        System.out.println("Name: " + Name + "Account number: " + AccountNumber + "Routing Number: "
                + RoutingNumber + "Balance: " + Balance);

    }

    public void setName(String name) {

        Name = name;
    }

    public void setAccountNumber(int accountNumber) {

        AccountNumber = accountNumber;
    }

    public void setRoutingNumber(int routingNumber) {

        RoutingNumber = routingNumber;
    }

    public void setBalance(double balance) {

        Balance = balance;
    }

    public String getName() {

        return Name;
    }

    public int getAccountNumber() {

        return AccountNumber;
    }

    public int getRoutingNumber() {

        return RoutingNumber;
    }

    public double getBalance() {

        return Balance;
    }
}
