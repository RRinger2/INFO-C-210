import java.util.ArrayList;

public class Person {
	
	//attributes 
	protected String name; 
	protected String address; 
	private ArrayList<Car> ownedCars = new ArrayList<Car>();

	// constructors
	public Person() {
		this.name = ""; 
		this.address = ""; 
		} //close default constructor
	
	public Person(String name, String address) {
		this.name = name; 
		this.address = address; 
		} //close non-default constructor 
	
	// set/mutator methods
	public void setName(String name) {
		this.name = name; 
		} //close setName
	
	public void setAddress(String address) {
		this.address = address; 
		} //close setAddress 
	
	public void setOwnedCars(Car car) {
		this.ownedCars.add(car); 
		}// close setOwnedCars 
	
	// get/accessor methods
	public String getName() {
		return this.name; 
		} //close getName 
	
	public String getAddress() {
		return this.address; 
		} // close getAddress 
	
	public ArrayList<Car> getOwnedCars() {
		return this.ownedCars; 
		} //close getOwnedCars
	
	// toString method
	public String toString() {
		String output = "Name: " + this.name + "\n"; 
		output += "Address: " + this.address + "\n"; 
		return output; 
		}

}
