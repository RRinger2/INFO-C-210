package finalProject;

public class CheckingAccount extends Account {
	// Instance Variable
	protected int Freetransaction;
	protected double Maintenancefee;

	//default  Constructor
	public CheckingAccount() {
	this.Freetransaction = 0;
	this.Maintenancefee = 0.0;
	} //close default Constructor 

	//non-default  Constructor
	public CheckingAccount(String accountNumber, double balance, Customer accountOwner, int Freetransaction, double Maintenancefee) {
	super(accountNumber, balance, accountOwner);
	this.Freetransaction = Freetransaction;
	this.Maintenancefee = Maintenancefee;
	} //close non-default Constructor 


	// Deposit method
	@Override
	public void deposit(double amount) {
		
		if (amount <= 0 ) {
		System.out.println("this amount not vaild.");
		} else {
		balance += amount;
	 	System.out.println("Deposited $" + amount + " into Checking Account.");
		} // close else 
	} // close deposit 
	   
	// Withdraw method
	@Override 
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrew $" + amount + " from Checking Account.");
		}else{
			System.out.println("Insufficient funds in Checking Account.");
			} //close else
	} // close withdraw 
	
}// close class 
