
public final class HourlyBasedEmployee extends Employee {
	//Instance vars:
	private double wagePerHour;
	private double numberHours;

	//Constructors:
	public HourlyBasedEmployee(String name, String address, int age, Country countryOfBirth, Country countryOfResidence, String employeeID, double wagePerHour, double numberHours) {
		super (name, address, age, countryOfBirth, countryOfResidence, employeeID);
		this.wagePerHour = wagePerHour;
		this.numberHours = numberHours;
	}

	protected double calculatePay() {
		if (numberHours <= 40)
			return numberHours * wagePerHour;
		else //there's an overtime
			return (wagePerHour * 40) + (numberHours - 40) * (2 * wagePerHour);
	}
}
