public final class SalaryBasedEmployee extends Employee {
	
	//instance variables:
	private double annualWage;
	
	//Constructors:
	public SalaryBasedEmployee(String name, String address, int age, Country countryOfBirth, Country countryOfResidence, String employeeID, double annualWage) {
		super (name, address, age, countryOfBirth, countryOfResidence, employeeID);
		this.annualWage= annualWage;
	}
	
	protected double calculatePay() {
		return annualWage/52; //weekly pay
	}
	
	public String toString () {
		String output = super.toString();
		output += "\nThis is a Salary-based EMployee\n" + 
		"Employee ID is: " + this.employeeID + 
		"\nEmployee Weekly Salary: " + this.calculatePay();
		
		return output;
	}

}
