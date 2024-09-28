import java.util.ArrayList;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Bank {
	
	public static ArrayList<Branch> branches = new ArrayList<Branch>(); 
	static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
    	    
    	//creating Chicago branch
    	Branch chicago = new Branch("123 Main", "Chicago", "111-111-1111"); 
    	
    	//adding chicago to the branches ArrayList
		branches.add(chicago);
    	
    	//creating Louisville branch 
    	Branch louisville = new Branch("444 Dixie Hwy", "Louisville", "222-222-2222"); 
    	
    	//adding Louisville to the branches ArrayList
		branches.add(louisville); 
    	
    	//creating new CommercialCustomer (Problem 1a) 
    	CommercialCustomer bob = new CommercialCustomer("Bob Barkly", "445 Mulberry St", 
    			"111-456-4567", 675, "Belinda", "222-222-2222"); 
    	
    	//creating Checking Account for new CommercialCustomer (Problem 1a) 
    	CheckingAccount bobCheckingAccount = new CheckingAccount("1234", 500, LocalDate.now(),
    			"Paper Checks", 0.0); 
    	
		//adding Bob's checking account to his list of accounts
		bob.setCustomerAccounts(bobCheckingAccount);
		//creating new PersonalCustomer
		
		//adding bob to chicago arraylist of customers 
		chicago.setBranchCustomer(bob); 
		
		//creating new PersonalCustomer (Problem 1d) 
		PersonalCustomer betsy = new PersonalCustomer("Betsy Brown", "520 Black St", "444-456-4567", 
				"444-440-4102", "444-561-1324"); 
		
		//creating Savings Account for Betsy
		SavingsAccount betsySavingsAccount = new SavingsAccount("5678", 100, LocalDate.now(), 10.0);
		
		//adding Betsy's savings account to her list of accounts
		betsy.setCustomerAccounts(betsySavingsAccount);
		
		//adding Betsy to the Louisville Branch 
		louisville.setBranchCustomer(betsy);
		
    	System.out.println("Displaying All Branches created above and any customers + accounts held at that branch"); 

		for (Branch branch: branches) {
			System.out.println(branch.toString());
		} //close iteration of branch arraylist 
		
		//displaying customer & account details without sensitive information 
		System.out.println("Displaying customer details and a list of accounts (Problem 1b)");
		System.out.println(displayCustomers(bob));
		
		//displaying Betsy's account details
		System.out.println(displayCustomers(betsy));

		
		// depositing $100 into the Bob's checking account
		bobCheckingAccount.makeDeposit(100);
		betsySavingsAccount.makeDeposit(100);
		
		System.out.println("Displaying Bob's updated Balance (Problem 1c)");
		System.out.println(displayCustomers(bob));
		
		System.out.println("displaying Betsy's new balance and recalculated monthly interest (Problem 1f)");
		System.out.println(betsySavingsAccount.toString());
	} //close main  
    
    //method to display customer info and their accounts
    public static String displayCustomers(Customer customer) {
    	
        String output = "Customer Name: " + customer.getName() + "\n";
	    output += "Customer Address: " + customer.getAddress() + "\n";
	    output += "Customer Phone Number: " + customer.getPhone() + "\n";
	    output += "\n";
	    
	    //for loop to iterate through customerAccounts ArrayList
	    for (Account account : customer.getCustomerAccounts()) {
	    	
	    	output+= "Account Type: " + account.getAccountType() + "\n";
    	    output += "Account Number: " + account.getAccountNumber() + "\n"; 
    	    output += "Account Balance: " + account.getBalance() + " ";
		    output += "\n";
	    } // close for loop 
	    return output;	
	   
	} // close displayCustomers}
    
} // closes banks