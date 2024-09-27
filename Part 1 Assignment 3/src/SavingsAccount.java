
import java.time.LocalDate;

public final class SavingsAccount extends Account {
	private double interestRate; 

	//constructor 
	public SavingsAccount(String accountNumber, double balance, LocalDate dateOpened, double interestRate) {
		super(accountNumber, balance, dateOpened);
		this.interestRate = interestRate;
	} // close constructor 
	
	//set interest rate method
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	} // close setInterestRate
	
	//get interest rate method 
	public double getInterestRate() {
		return interestRate;
	} // close constructor 
	
	protected double getMonthlyInterestRate() {
		//calculates monthly interest rate 
		double NUM_OF_MONTHS = 12; 
		double DECIMAL_PERCENTAGE = 100; 
		double decimalAnnualInterest = interestRate / DECIMAL_PERCENTAGE;
		double monthlyInterestRateDecimal = decimalAnnualInterest / NUM_OF_MONTHS; 
		double monthlyInterestRate = monthlyInterestRateDecimal * DECIMAL_PERCENTAGE; 
		return monthlyInterestRate;
	} // end getMonthlyInterestRate
	
	protected double getMonthlyInterest() {
		//calculates monthly interest earned on savings account
		double DECIMAL_PERCENTAGE = 100; 
		double monthlyInterestRate = this.getMonthlyInterestRate(); 
		double monthlyInterestToDecimal = monthlyInterestRate / DECIMAL_PERCENTAGE; 
		double monthlyInterest = monthlyInterestToDecimal * this.getBalance();
		return monthlyInterest;
	} // end getMonthlyInterestRate
	
    public String toString() {
	    String output = "Account Type: Savings\n";
	    output += super.toString(); 
	    output += "\nInterest Rate: " + this.interestRate;
	    output += "\nMonthly Interest: " + this.getMonthlyInterest() + "\n"; 
	    output += "\n";
	    return output;	
    } // close toString
} // close class 
