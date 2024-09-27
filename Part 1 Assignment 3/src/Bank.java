import java.util.ArrayList;
import java.time.LocalDate;

public class Bank {
	
	public ArrayList<Branch> branches = new ArrayList<Branch>(); 

    public static void main(String[] args) {
    
    	//creating Chicago branch 
    	Branch chicago = new Branch("123 Main", "Chicago", "111-111-1111"); 		
    	
    	//creating new CommercialCustomer
    	CommercialCustomer bob = new CommercialCustomer("Bob", "445 Mulberry St", 
    			"111-456-4567", 675, "Belinda", "222-222-2222"); 
    	
    	//creating Checking Account for Bob 
    	CheckingAccount bobCheckingAccount = new CheckingAccount("1234", 500, LocalDate.now(),
    			"Paper Checks", 0.0); 
		bob.addAccount(bobCheckingAccount);
		
		//creating Savings Account for Bob
		SavingsAccount bobSavingsAccount = new SavingsAccount("5678", 100, LocalDate.now(),
				10.0);
		//adding Bob's savings account to his list of accounts
		bob.addAccount(bobSavingsAccount);
		
		//adding bob to chicago arraylist of customers 
		chicago.addCustomer(bob);
		
    	//displaying chicago branch created above and any customers + accounts held at that branch 
		System.out.println(chicago);
		
	} //close main  

}