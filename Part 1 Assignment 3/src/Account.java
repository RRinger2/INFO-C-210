

// I do not know if this is the right package for date opened instance variable

import java.util.Date;


//BankAccount.java
//Parent class BankAccount



public class Account {
    // Instance Variable
    private final Date dateopened;
    private String accountNumber;
    private double balance;

//non-default Constructor to initialize account number and balance

    public Account(String accountNumber, double balance, Date dateopened  ) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateopened = dateopened;
    }

// Method to deposit an amount into the account

    public void deposit(double amount) {

        balance += amount;

    }

// Method to withdraw an amount from the account

    public void withdrawl(double amount) {
//if the balance is sufficient for the withdrawal
        if (balance >= amount) {

// Decrease the balance when the withdrawal amount occur

            balance -= amount;

        } else {
            System.out.println("No enough money");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        // Return the current balance
        return balance;


    }
}