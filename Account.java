import java.time.LocalDate; 

public class Account {
	private int id; 
	private double balance; 
	private double annualInterestRate; 
	private LocalDate dateCreated; 
	
	
	//default constructor 
	public Account() {
		this.id = 0; 
		this.balance = 0.0; 
	} // end default constructor 
	
	//non-default constructor 
	public Account (int id, double balance, double annualInterestRate) {
		this.id = id; 
		this.balance = balance; 
		this.annualInterestRate= annualInterestRate; 
		
	}//end non-default constructor 

	//set/mutator methods 
	public void setID(int id) {
		this.id = id; 
	} // end setID
	
	public void setAnnualInterestRate (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate; 
	} // end setAnnualInterestRate
	
	//get/accessor methods 
	public int getID(int id) {
		return this.id = id; 
	} // end getID
	
	public LocalDate getDateCreated (LocalDate dateCreated) {
		return this.dateCreated = LocalDate.now(); 
	} // end getDateCreated 
	
	public double getBalance(double balance) {
		return this.balance = balance; 
	} // end getBalance
	
	public double getAnnualInterestRate (double annualInterestRate) {
		return this.annualInterestRate = annualInterestRate; 
	} // end getAnnualInterestRate
	
	//Problem 1 # 9 
	public double getMonthlyInterestRate() {
		//need to write code to calculate annualInterestRate / 12 (remember 5% = .05) 
		double NUM_OF_MONTHS = 12; 
		double DECIMAL_PERCENTAGE = 100; 
		double decimalAnnualInterest = annualInterestRate / DECIMAL_PERCENTAGE;
		double monthlyInterestRateDecimal = decimalAnnualInterest / NUM_OF_MONTHS; 
		double monthlyInterestRate = monthlyInterestRateDecimal * DECIMAL_PERCENTAGE; 
		return monthlyInterestRate;
	} // end getMonthlyInterestRate
	
	// Problem 1 # 10
	public double getMonthlyInterest() {
		//need to write code to calculate monthlyInterestRate * balance (remember 5% = .05) 
		double DECIMAL_PERCENTAGE = 100; 
		double monthlyInterestRate = this.getMonthlyInterestRate(); 
		double monthlyInterestToDecimal = monthlyInterestRate / DECIMAL_PERCENTAGE; 
		double monthlyInterest = monthlyInterestToDecimal * balance;
		return monthlyInterest;
	} // end getMonthlyInterestRate
	
	// Problem 1 # 11 
	public double withdraw (double withdrawAmount) {
		// need to write code to withdraw a specified amount into the account 
		double newBalance; 
		return newBalance; 
	} // end withdraw 
	
	// Problem 1 # 12 
	public double deposit (double depositAmount) {
		// need to write code to deposit a specified amount into the account 
		double newBalance; 
		return newBalance; 
	} // end deposit 

	public String toString() { 
		String output = "Account ID: " + this.id; 
		output+= "\nAccount Balance: " + this.balance; 
		output+= "\nAnnual Intereset Rate: " + this.annualInterestRate + "\n"; 
		
		return output; 
	}
} //end class
