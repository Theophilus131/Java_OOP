package AccountTest;

import Account.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountBalanceIsZero() {
        Account theoAccount = new Account();
        assertEquals(0, theoAccount.getBalance());
    }

    @Test
    public void testThatIDeposited2KInMyAccount() {
        Account theoAccount = new Account();
        theoAccount.deposit(2_000);
        assertEquals(2_000, theoAccount.getBalance());
    }

    @Test
    public void testThatIHave5kBalanceInMyAccount() {
        Account theoAccount = new Account();
        theoAccount.deposit(5_000);
        theoAccount.withdraw(2_000);
        assertEquals(3_000, theoAccount.getBalance());
    }

    @Test
    public void testThatIDeposited5KInAccountIWithdraw6KBalanceShouldBe5k() {
        Account theoAccount = new Account();
        theoAccount.deposit(5_000);
        theoAccount.withdraw(6_000);
        assertEquals(5_000, theoAccount.getBalance());
    }

    @Test
    public void testCorrectPin(){
        Account theoAccount = new Account();
        theoAccount.getCorrectPin("correctPin");
        assertEquals("correctPin", theoAccount.getCorrectPin("correctPin"));
    }

    @Test
    public void testPinIsNotCorrect(){
        Account theoAccount = new Account();
        theoAccount.getCorrectPin("wrongPin");
        assertEquals("wrongPin", theoAccount.getCorrectPin("wrongPin"));
    }

}
