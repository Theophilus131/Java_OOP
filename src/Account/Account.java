package Account;

public class Account {

    private int balance;
    private String correctPin;

    public String getCorrectPin(String defaultPin) {
        return correctPin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance;
        balance -= amount;
        }

    }
}
