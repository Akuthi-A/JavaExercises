package banking;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Bank urBank = new Bank();
        Bank aBank = new Bank(10000);

        System.out.println(urBank.toString());
        System.out.println(aBank.toString());
    }
}