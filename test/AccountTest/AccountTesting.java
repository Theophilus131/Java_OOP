package AccountTest;

import Account.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTesting {

    Account theoAccount = new Account();

    @Test
    public void testThatAccountBalanceIsZero() {
        assertEquals(0, theoAccount.getBalance());
    }

    @Test
    public void testThatIDeposited2KInMyAccount() {
        theoAccount.deposit(2_000);
        assertEquals(2_000, theoAccount.getBalance());
    }

    @Test
    public void testThatIHave5kBalanceInMyAccount() {
        theoAccount.deposit(5_000);
        theoAccount.withdraw(2_000);
        assertEquals(3_000, theoAccount.getBalance());

    }

    @Test
    public void testThatIDeposited5KInAccountIWithdraw6KBalanceShouldBe5k() {
        theoAccount.deposit(5_000);
        theoAccount.withdraw(6_000);
        assertEquals(5_000, theoAccount.getBalance());
    }

    @Test
    public void testCorrectPin(){
        theoAccount.getCorrectPin("defaultPin");
        assertEquals("defaultPin", theoAccount.getCorrectPin("defaultPin"));
    }

}
