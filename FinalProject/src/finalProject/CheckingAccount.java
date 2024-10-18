package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList; 

public class CheckingAccount extends Account implements BankOperations{
	
	// no monthly interest accrued for checking account
	// first 2 transactions are free every month, charges a $3 fee for any transaction after that 
	ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
	private int transactionCount = 0; 
	

	//default  Constructor
	public CheckingAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} //close default Constructor 

	//non-default  Constructor
	public CheckingAccount(String accountNumber, double balance, Customer accountOwner) {
	super(accountNumber, balance, accountOwner);
	} //close non-default Constructor 
	
	//adding an account to the list of checking accounts
	@Override
	public void addAccount(Account account) {
		checkingAccounts.add((CheckingAccount) account);
	} //close addAccount

	@Override
	public void removeAccount(Account account) {
		checkingAccounts.remove((CheckingAccount) account);
	} //close removeAccount 

	// Deposit method
	public double deposit(double amount) {
		 //this needs a try catch 
		if (amount <= 0 ) {
		System.out.println("this amount not vaild.");
		} else {
		balance += amount;
		} // close else 
	 	System.out.println("Deposited $" + amount + " into Checking Account.");
	 	System.out.println("The new balance is $" + balance + ".");
	 	transactionCount++;
		return balance; 
	} // close deposit 
	   
	// Withdraw method
	@Override 
	public double withdraw(double amount) {
		
		//this needs a try catch finally 
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal Complete. The new balance is $" + balance + ".");
		}else{
			System.out.println("Requested Withdrawal Amount $" + amount + " exceeds the current balance of $" + balance + ".");
			System.out.println("Amount Withdrawn $" + balance + ".");
			balance = 0;
		} //close else
		transactionCount++;
		return balance;
	} // close withdraw 
	
	//toString Method 
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.##"); // format the balance to show as currency 
		String output = "Account Number: " + accountNumber + "\n";
		output += "Account Balance: " + df.format(balance) + "\n";
		output += "Account Owner: " + accountOwner.getCustomerName() + "\n";
		return output;
	} //close toString


	@Override
	public double applyFees(Account account) {
		// checking accounts charge $3 fee for every transaction after the first 2 transactions
		int transactionFees = 0; 
		if (transactionCount > 2) {
			transactionCount = transactionCount - 2;
			transactionFees = transactionCount * 3;
			balance -= transactionFees;
		}//close if 
		toString(); 
		System.out.println("The monthly transaction fees applied to this account were $" + transactionFees + ".");
		System.out.println("The new balance is $" + balance + ".");
		transactionCount = 0;
		transactionFees = 0;
		return balance;
	} //close applyFees 

	@Override
	public double calculateInterest(Account account) {
		// checking accounts don't accrue interest 
		return 0;
	} //close calculateInterest

	@Override
	public double applyInterest(Account account) {
		// checking accounts don't accrue interest 
		return 0;
	} //close applyInterest
	
}// close class 
