package finalProject;

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

} //close class
