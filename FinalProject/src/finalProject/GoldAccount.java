package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GoldAccount extends Account implements BankOperations {
	
	// no transaction fees 
	// monthly interest is 0.5 or 5% 
	// Gold accounts can make indefinite withdrawals and the balance can go negative 
	
	ArrayList<Account> goldAccounts = new ArrayList<Account>();
	
	
	//default constructor 
	public GoldAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} //close default constructor 
	
	//non-default constructor 
	public GoldAccount(String accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	} // close non-default constructor
	
	//Method to display that account information
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency 
		String output = "Account Number: " + accountNumber + "\n";
		output += "Account Balance: " + df.format(balance) + "\n";
		output += "Account Owner: " + accountOwner.getCustomerName() + "\n";
		return output;
	} //close toString
	
	//interface implementations 
	
	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	} //close deposit 
	
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	} //close withdraw 
	
	
	@Override
	public void addAccount(Account account) {
		// adding account to ArrayList
		goldAccounts.add(account);
	} //close addAccount
	
	@Override
	public void removeAccount(Account account) {
		// removing account from ArrayList
		goldAccounts.remove(account);
	} //close removeAccount

	@Override
	public double applyFees(Account account) {
		// TODO Auto-generated method stub
		return 0;
	} //close applyFees 

	@Override
	public double calculateInterest(Account account) {
		// TODO Auto-generated method stub
		return 0;
	} //close calculateInterest 

	@Override
	public double applyInterest(Account account) {
		// TODO Auto-generated method stub
		return 0;
	} //close applyInterest 

} //close class

