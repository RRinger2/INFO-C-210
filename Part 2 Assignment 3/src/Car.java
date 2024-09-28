
public class Car {

	//attributes 
	protected String make; 
	protected String model; 
	protected int year; 
	protected String vinNumber;
	
	//default constructor 
	public Car() {
		this.make = "";
		this.model = "";
		this.year = 0;
		this.vinNumber = "";
	} //close default constructor 
	
	//non-default constructor
	public Car(String make, String model, int year, String vinNumber) {
		this.make = make; 
		this.model = model; 
		this.year = year; 
		this.vinNumber = vinNumber; 
	} //close non-default constructor 
	
	//set/mutator methods
	public void setMake(String make) {
		this.make = make; 
		} //close setMake 
	
	public void setModel(String model) {
		this.model = model; 
		} //close setModel 
	
	public void setYear(int year) {
		this.year = year; 
		} //close setYear 
	
	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber; 
		} //close setVinNumber 
	
	//get/accessor methods
	public String getMake() {
		return this.make; 
		} //close getMake 
	
	public String getModel() {
		return this.model; 
		} //close getModel 
	
	public int getYear() {
		return this.year; 
		} //close getYear 
	
	public String getVinNumber() {
		return this.vinNumber; 
		} //close getVinNumber 
	
	//toString method
	public String toString() {
		String output = "Make: " + this.make + "\n"; 
		output += "Model: " + this.model + "\n"; 
		output += "Year: " + this.year + "\n"; 
		output += "Vin Number: " + this.vinNumber + "\n"; 
		return output; 
		} //close toString 

} // close Car
