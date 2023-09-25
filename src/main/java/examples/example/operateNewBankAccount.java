package examples.example;

public class operateNewBankAccount {
    public static void main(String[] args) {
        NewBankAccount accounts = new NewBankAccount("Brian",1234567,7654321,2061.98);
        accounts.viewDetails();

        accounts.deposit(1382.71);
        accounts.withdraw(1065);
        accounts.withdraw(500);

        System.out.println(accounts.getBalance());

    }
}
