// Declare checking Account class inheriting form BankAccount
public class CheckingAccount extends Account  {
	

	//Instance Variable 
	protected double withdraw;
	protected double deposit;
	
	//Constructor 
	
	public CheckingAccount (String accountNumber, double balance) {
		
		// Call parent class constructor
		
		super(accountNumber, balance);
	}
	
	//Override the withdraw method form the parent class
	
	public void withdraw(double amount) {
		
		if (getBalance () - amount < 100) {
			
			System.out.println("Minimum balance of $100 required!");
			
		} else {
			
			//Call the parent class withdraw mehtod
			
			super.withdraw(amount);
		}
	}
	// Override the  deposit method from the parent class
	public void deposit(double amount) {
		
		//this method should return the balance of the deposit method 
		getBalance (amount);
		
		super.deposit(amount);
				
	}

}
