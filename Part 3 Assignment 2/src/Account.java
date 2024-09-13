/**
 * Bank account with a unique ID and a balance.
 * Slightly Above Average Team
 * 9/13/2024
 */
public class Account {
    private int id; // Unique identifier for the account
    private double balance; // Current balance of the account

    // Constructs a new Account with the given ID and an initial balance of 0.
    public Account(int id) {
        this.id = id;
        this.balance = 0;
    }

    // Sets the balance of the account to the given amount.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Returns the current balance of the account.
    public double getBalance() {
        return balance;
    }

    // Returns the unique ID of the account.
    public int getId() {
        return id;
    }

    // Withdraws the given amount from the account.
    public void withdrawAmount(double amount) {
        balance -= amount;
    }

    // Deposits the given amount into the account.
    public void depositAmount(double amount) {
        balance += amount;
    }
}