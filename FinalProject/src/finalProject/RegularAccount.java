package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class RegularAccount extends Account implements BankOperations {
	
	// monthly interest is 0.6 or 6% 
	// no transaction fees 
	// Regular accounts have a monthly maintenace fee of $10 that needs to be applied in the applyFees method 
	
	ArrayList<Account> regularAccounts = new ArrayList<Account>();

	//default constructor 
	public RegularAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} //close default constructor 
	
	//non-default constructor 
	public RegularAccount(String accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	} // close non-default constructor
	
	//add account to the list of regular accounts
	public void addAccount(Account account) {
		regularAccounts.add(account);
	} //close addAccount
	
	//remove account from the list of regular accounts
	public void removeAccount(Account account) {
		regularAccounts.remove(account);
	} //close removeAccount
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.##"); // format the balance to show as currency
		String output = "Account Number: " + accountNumber + "\n";
		output += "Account Balance: " + balance + "\n";
		output += "Account Owner: " + accountOwner.getCustomerName() + "\n";
		return output;
	} //close toString 

	//deposit method 
	public double deposit(double amount) {
		// increase the balance 
		balance += amount;
		System.out.println("Deposited $" + amount + " into Regular Account.");
		System.out.println("The new balance is $" + balance + ".");
		return balance;
	} //close deposit 

	//withdraw method
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	} //close withdraw 

	@Override
	public double applyFees(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateInterest(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double applyInterest(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

} //close class 
