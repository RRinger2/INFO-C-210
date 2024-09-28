
public final class Sedan extends Car {
	
	//attributes
	private int doors; 
	private int trunkSize; 
	
	//default constructor 
	public Sedan() {
		super();
		this.doors = 0;
		this.trunkSize = 0;
	} //close default constructor 
	
	//non-default constructor
	public Sedan(String make, String model, int year, String vinNumber, int doors, int trunkSize) {
		super(make, model, year, vinNumber); 
		this.doors = doors; 
		this.trunkSize = trunkSize; 
	} //close non-default 
	
	//set methods 
	public void setDoors(int doors) {
		this.doors = doors; 
	} //close setDoors
	
	public void setTrunkSize(int trunkSize) {
		this.trunkSize = trunkSize; 
	} //close setTrunkSize
	
	//get methods 
	public int getDoors() {
		return this.doors; 
	} //close getDoors
	
	public int getTrunkSize() {
		return this.trunkSize; 
	} //close getTrunkSize 
		
	//toString method
	public String toString() {
		String output = super.toString();
		output += "\nDoors: " + this.getDoors() + "\n";
		output += "\nTrunk Size: " + this.getTrunkSize() + "\n";
		return output;
	} //close toString

}
