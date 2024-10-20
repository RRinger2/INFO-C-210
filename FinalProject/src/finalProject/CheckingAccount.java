package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList; 

public final class CheckingAccount extends Account {
	
	// no monthly interest accrued for checking account
	// first 2 transactions are free every month, charges a $3 fee for any transaction after that 
	private int transactionCount = 0; 
	
	DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency
	

	//default  Constructor
	public CheckingAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} //close default Constructor 

	//non-default  Constructor
	public CheckingAccount(String accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	} //close non-default Constructor 
	
	//set & get Account Number
	public String setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber; 
		return accountNumber;
	} //close setAccountNumber
	
	public String getAccountNumber() {
		return accountNumber; 
	} //close getAccountNumber 

	//set & Get account balance 
	public double setBalance(double balance) {
		this.balance = balance; 
		return balance;
	} //close setBalance
	
	public double getBalance() {
		return balance; 
	} //close getBalance
	
	//set & get account Owner
	public Customer setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner; 
		return accountOwner;
	} //close setAccountOwner
	
	public Customer getAccountOwner() {
		return accountOwner; 
	} //close getAccountOwner

	
	//abstract methods from Account class
	// Deposit method
	public double deposit(double amount) {
		 //this needs a try catch 
		balance += amount;
			System.out.println("Deposited $" + df.format(amount) + " into Checking Account " + accountNumber + ".");
		 	System.out.println("The new balance is $" + df.format(balance) + ".");
		 	transactionCount++;
		    return balance; 
	} // close deposit 
	   
	// Withdraw method
	@Override 
	public double withdraw(double amount) {
		try {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal of $" + df.format(amount) + " from Checking Account " + accountNumber + " successful."); 
			System.out.println("The new balance is $" + df.format(balance) + ".");
		}else{
			System.out.println("Requested Withdrawal Amount $" + df.format(amount) + " exceeds the current balance of $" + df.format(balance) + ".");
			System.out.println("Amount Withdrawn $" + df.format(balance) + ".");
			balance = 0;
		 	System.out.println("The new balance is $" + df.format(balance) + ".");
		} //close else
		transactionCount++;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} //close try/catch
		return balance;
	} // close withdraw 
	
	@Override
	public double applyMonthEnd() {
		// checking accounts charge $3 fee for every transaction after the first 2 transactions
		int transactionFees = 0; 
		if (transactionCount > 2) {
			transactionCount = transactionCount - 2;
			transactionFees = transactionCount * 3;
			balance -= transactionFees;
		}//close if 
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Owner: " + this.accountOwner.getCustomerName());
		System.out.println("Account Type: Checking");
		System.out.println("The monthly transaction fees applied to this account were $" + df.format(transactionFees) + ".");
		System.out.println("The new balance is $" + df.format(balance) + ".\n");
		transactionCount = 0;
		transactionFees = 0;
		return balance;
	} //close applyFees 
	
	@Override
	void displayInfo() {
		System.out.println(toString());
	} //close displayInfo
	
	//toString Method 
	public String toString() {
		String output = "Account Owner: " + accountOwner.getCustomerName();
		output += "\nAccount Type: Checking";
		output += "\nAccount Number: " + accountNumber;
		output += "\nAccount Balance: $" + df.format(balance);
		output += "\n";
		return output;
	} //close toString
	
}// close class 
