

// I changed this import and the related variables to the same java utility we used for the date in assignment 2 - AB
import java.time.LocalDate; 

//BankAccount.java
//Parent class BankAccount

public class Account {

   // Instance Variables
    private String accountNumber;
    private double balance;
    private LocalDate dateOpened;
    
    //default constructor 
    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.dateOpened = LocalDate.now();
        // added the default constructor - AB
    } //close default constructor 

    //non-default Constructor to initialize account number and balance
    public Account(String accountNumber, double balance, LocalDate dateOpened) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateOpened = dateOpened;
    } //close non-default constructor 
    
    //set/mutator methods 
    public void setAccountNumber(String accountNumber) {
	    this.accountNumber = accountNumber;
	} //close setAccountNumber
	
	public void setBalance(double balance) {
	    this.balance = balance;
	} //close setBalance
	
	public void setDateOpened(LocalDate dateOpened) {
	    this.dateOpened = dateOpened;
	} //close setDateOpened

	//get/accessor methods
	public String getAccountNumber() {
		return this.accountNumber;
	} //close getAccountNumber
	
	public LocalDate getDateOpened() {
		return this.dateOpened = LocalDate.now();
	} //close getDateOpened

    // Method to deposit an amount into the account
    protected double makeDeposit(double amount) {
        balance = this.balance + amount;
        return balance; 
    } // close makeDeposit

// Method to withdraw an amount from the account

    protected double makeWithdrawl(double amount) {
    	//if the balance is sufficient for the withdrawal
        if (balance >= amount) { 
			balance = this.balance - amount;
			return balance;
        } else { // if the balance is not sufficient for the withdrawal - print not enough money
           System.out.println("Not enough money. \nCurrent balance: " + balance);
		   return balance;
        } // close if else 
    } // close makeWithdrawal 

    // Method to get the current balance
    public double getBalance() {
        // Return the current balance
        return balance;
	} // close getBalance 
    
    //master toString Method 
    public String toString() {
	    String output = "Account Number: " + this.accountNumber;
	    output += "\nBalance: " + this.balance;
	    output += "\nDate Opened: " + this.dateOpened;
	    return output;	
    } // close toString
    
} // close Account Class 

