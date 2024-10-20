package finalProject;


public abstract class Account {

	// Instance Variable 
	protected String accountNumber;
	protected double balance;
	protected Customer accountOwner;

	abstract double deposit(double amount);
	abstract double withdraw(double amount);
	abstract double applyMonthEnd(); 
	abstract void displayInfo(); 
		
} //close class
