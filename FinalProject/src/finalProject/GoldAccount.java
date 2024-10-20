package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;

public final class GoldAccount extends Account {
	
	// no transaction fees 
	// monthly interest is 0.5 or 5% 
	// Gold accounts can make indefinite withdrawals and the balance can go negative 
	DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency

	
	//default constructor 
	public GoldAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} //close default constructor 
	
	//non-default constructor 
	public GoldAccount(String accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	} // close non-default constructor
	
	//set & get Account Number
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber; 
	} //close setAccountNumber
	
	public String getAccountNumber() {
		return this.accountNumber; 
	} //close getAccountNumber 

	//set & Get account balance 
	public void setBalance(double balance) {
		this.balance = balance; 
	} //close setBalance
	
	public double getBalance() {
		return this.balance; 
	} //close getBalance
	
	//set & get account Owner
	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner; 
	} //close setAccountOwner
	
	public Customer getAccountOwner() {
		return this.accountOwner; 
	} //close getAccountOwner
		
	//abstract implementations 
		@Override
	public double deposit(double amount) {
		balance += amount;
		System.out.println("Deposited $" + df.format(amount) + " into Gold Account " + accountNumber + ".");
		System.out.println("The new balance is $" + df.format(balance) + ".");
		return this.balance;
	} //close deposit 
	
	@Override
	public double withdraw(double amount) {
		//gold accounts can make indefinite withdrawals and go negative on their balance
		balance -= amount;
		System.out.println("Withdrawal of $" + df.format(amount) + " from Gold Account " + accountNumber + " successful.");
		System.out.println("The new balance is $" + df.format(balance) + ".");
       	return this.balance; 
	} //close withdraw 
	
	
	@Override
	public double applyMonthEnd() {
		//gold accounts don't have fees 
		if (balance > 0) {
			balance *= 1.05;
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Account Owner: " + this.accountOwner.getCustomerName());
			System.out.println("Account Type: Gold");
			System.out.println("The balance has been increased by 5%");
			System.out.println("The new balance is $" + df.format(balance) + ".\n");
		} else {
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Account Owner: " + this.accountOwner.getCustomerName());
			System.out.println("Account Type: Gold");
			System.out.println("Monthly Interest can not be applied to Accounts without a Positive Balance.");
			System.out.println("The current balance is $" + df.format(balance) + ".\n");
		}

		return balance;
	} //close applyMonthEnd
	
	@Override
	void displayInfo() {
		System.out.println(toString());
	} //close displayInfo
	
	//toString Method 
	public String toString() {
		String output = "Account Owner: " + accountOwner.getCustomerName();
		output += "\nAccount Type: Gold";
		output += "\nAccount Number: " + accountNumber;
		output += "\nAccount Balance: $" + df.format(balance);
		output += "\n";
		return output;
	} //close toString

} //close class

