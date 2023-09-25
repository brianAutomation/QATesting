package examples.example;

public class operateBofa {
    public static void main(String[] args) {
        BOFAAcount account = new BOFAAcount("Kim",1234567,2345090,5609.67);
        account.viewDetails();

        account.Deposit(5000);
        account.Withdraw(2000);
        account.Withdraw(1200.32);

        System.out.println("Final Balance: " + account.getBalance());

    }
}
