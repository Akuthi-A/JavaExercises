package banking;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BankAccount urBank = new BankAccount();
        BankAccount aBank = new BankAccount(10000);

        System.out.println(urBank.toString());
        System.out.println(aBank.toString());
    }
}