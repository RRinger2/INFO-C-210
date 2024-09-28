import java.util.ArrayList;

public final class CarOwner extends Person {
	
	//array list to store owned cars under specific owner
	protected ArrayList<Car> ownedCars = new ArrayList<Car>();
	
	//constructor 
	public CarOwner(String name, String address) {
		super (name, address); 
	} //close constructor 
	
	//set method 
	public void setOwnedCars(Car car) {
		this.ownedCars.add(car); 
	} // close set	
	
	//get method
	public ArrayList<Car> getOwnedCars() {
		return this.ownedCars; 
	} // close getOwnedCars 
	
	
	//toString method
	public String toString() {
		String output = super.toString();
		output += "\nOwned Cars: \n";
		for (Car car : ownedCars) {
			output += car.toString() + "\n";
		}  //close for loop 
		return output;
		} //close toString

} //close class
