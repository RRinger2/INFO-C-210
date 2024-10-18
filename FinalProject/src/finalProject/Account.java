package finalProject;

import java.text.DecimalFormat;

public abstract class Account {

		// Instance Variable 
		protected String accountNumber;
		protected double balance;
		protected Customer accountOwner;


		// Default Constructor
		public Account() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null; 
		} //close default constructor 

		// Non-default Constructor
		public Account(String accountNumber, double balance, Customer accountOwner) {
		this.accountOwner = accountOwner;
		this.accountNumber = accountNumber;
		this.balance = balance;
		} //close non-default constructor

		// Abstract method that subclasses must implement 
		public abstract void deposit(double amount);
		public abstract void withdraw(double amount);

		// Method to display that account information
		   public String toString() {
			DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency 
			String output = "Account Number: " + accountNumber + "\n";
			output += "Account Balance: " + df.format(balance) + "\n";
			output += "Account Owner: " + accountOwner.getCustomerName() + "\n";
			return output;
		} //close toString


} //close class
