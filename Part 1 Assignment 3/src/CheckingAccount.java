
import java.time.LocalDate; 
import java.text.DecimalFormat;

//CheckingAccount.java
//Parent class Account

public final class CheckingAccount extends Account {
	
		private String checkStyle; 
		private double minimumBalance; 

	public CheckingAccount(String accountNumber, double balance, LocalDate dateOpened, String checkStyle, double minimumBalance) {
		super(accountNumber, balance, dateOpened);
		this.checkStyle = checkStyle; 
		this.minimumBalance = minimumBalance;
	} //close constructor 

		public void setCheckStyle(String checkStyle) {
		this.checkStyle = checkStyle;
	} //close setCheckStyle
	
	protected double minimumBalance() {
		this.minimumBalance = 0.0;
		
		return minimumBalance;
	} // establishing standard minimum balance for checking accounts 
	
	public String getCheckStyle() {
		return checkStyle;
	} //close getCheckStyle

	public double getMinimumBalance() {
		return minimumBalance;
	} // close getMinimumBalanace 
	
    public String toString() {
	    String output = "Account Type: Checking\n";
	    output += super.toString(); 
	    output += "\nCheck Style: " + this.checkStyle;
	    output += "\nMinimum Balance: " + this.minimumBalance;
	    output += "\n";
	    return output;	
    } // close toString
} //close class
