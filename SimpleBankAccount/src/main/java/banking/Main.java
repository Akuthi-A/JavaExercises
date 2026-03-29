package banking;

public class Main {
    public static void main(String[] args) {
        BankAccount aBankAccount = new BankAccount("Kenny", 10000);

        aBankAccount.displayBalance();
        aBankAccount.withdraw(2000);
        aBankAccount.displayBalance();
        aBankAccount.deposit(1000);
        aBankAccount.displayBalance();

        
    }
}
