package finalProject;

public interface BankOperations {
	
	// a list of actions a Bank Operator can apply 
	
	double deposit(double amount);
	double withdraw(double amount);
	void addAccount(Account account); 
	void removeAccount(Account account);
	double applyFees(Account account); 
	double calculateInterest(Account account);
	double applyInterest(Account account); 
	String toString(); 
	
} //close interface 
