import banking.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("Alice", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("Bob", 500.0);
        account.deposit(200.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount("John", 300.0);
        account.deposit(-100.0);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("Alice", 1000.0);
        account.withdraw(400.0);
        assertEquals(600.0, account.getBalance());
    }

    @Test
    void testWithdrawTooMuch() {
        BankAccount account = new BankAccount("Bob", 200.0);
        account.withdraw(500.0);
        assertEquals(200.0, account.getBalance()); // no overdraft
    }
}