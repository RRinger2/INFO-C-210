public abstract class Employee extends Person {
	//Instance variables:
	protected String employeeID;
	
	//Constructors:
	public Employee(String name, String address, int age, Country countryOfBirth, Country countryOfResidence, String employeeID) {
		super (name, address, age, countryOfBirth, countryOfResidence);
		this.employeeID = employeeID;
	}
	
	//Instance methods:
	protected abstract double calculatePay();

}
