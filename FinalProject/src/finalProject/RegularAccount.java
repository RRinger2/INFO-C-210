package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;

public final class RegularAccount extends Account {

	DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency
	private static final double MAINTENANCE_FEE = 10.0;

	// monthly interest is 0.6 or 6%
	// no transaction fees
	// Regular accounts have a monthly maintenace fee of $10 that needs to be
	// applied in the applyFees method

	// default constructor
	public RegularAccount() {
		this.accountNumber = "";
		this.balance = 0.0;
		this.accountOwner = null;
	} // close default constructor

	// non-default constructor
	public RegularAccount(String accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	} // close non-default constructor

	// set & get Account Number
	public String setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return accountNumber;
	} // close setAccountNumber

	public String getAccountNumber() {
		return accountNumber;
	} // close getAccountNumber

	// set & Get account balance
	public double setBalance(double balance) {
		this.balance = balance;
		return balance;
	} // close setBalance

	public double getBalance() {
		return balance;
	} // close getBalance

	// set & get account Owner
	public Customer setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
		return accountOwner;
	} // close setAccountOwner

	public Customer getAccountOwner() {
		return accountOwner;
	} // close getAccountOwner

	// deposit method
	@Override
	public double deposit(double amount) {
		// increase the balance
		balance += amount;
		System.out.println("Deposited $" + df.format(amount) + " into Regular Account " + accountNumber + ".");
		System.out.println("The new balance is $" + df.format(balance) + ".");
		return balance;
	} // close deposit

	// withdraw method
	@Override
	public double withdraw(double amount) {
		try {
			if (amount < balance) {
				balance -= amount;
				System.out.println("Withdrawal of $" + df.format(amount) + " from Regular Account " + accountNumber
						+ " successful.");
				System.out.println("The new balance is $" + df.format(balance) + ".");
			} else if (amount > balance) {
				System.out.println("Requested Withdrawal Amount $" + df.format(amount)
						+ " exceeds the current balance of $" + df.format(balance) + ".");
				System.out.println("Amount Withdrawn $" + df.format(balance) + ".");
				System.out.println("The balance is now $0.00.");
				balance = 0;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} // close try/catch
		return balance;
	} // close withdraw

	@Override
	public double applyMonthEnd() {
		if (balance > 0) {
			balance *= 1.06;
			balance -= MAINTENANCE_FEE;
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Account Owner: " + this.accountOwner.getCustomerName());
			System.out.println("Account Type: Regular");
			System.out.println("The monthly maintenace fee of $10 was deducted from this account.");
			System.out.println("The balance has been increased by 6%");
			System.out.println("The new balance is $" + df.format(balance) + ".\n");
		} else {
			balance -= MAINTENANCE_FEE;
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Account Owner: " + this.accountOwner.getCustomerName());
			System.out.println("Account Type: Gold");
			System.out.println("Monthly Interest can not be applied to Accounts without a Positive Balance.");
			System.out.println("The current balance is $" + df.format(balance) + ".\n");
		}
		return balance;
	} // close applyFees

	// displayInfo void method needed so it can be called from the static main
	@Override
	void displayInfo() {
		System.out.println(toString());
	} // close displayInfo

	// toString Method
	public String toString() {
		String output = "Account Owner: " + accountOwner.getCustomerName();
		output += "\nAccount Type: Regular";
		output += "\nAccount Number: " + accountNumber;
		output += "\nAccount Balance: $" + df.format(balance);
		output += "\n";
		return output;
	} // close toString

} // close class
