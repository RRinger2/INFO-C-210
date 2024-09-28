
public final class SportsCar extends Car {
	
	private int raceStats; 
	
	//defaultConstructor 
	public SportsCar() {
		super(); 
		this.setRaceStats(0); 
	} // close default constructor 
	
	//non-default constructor
	public SportsCar(String make, String model, int year, String vinNumber, int raceStats) {
		super(make, model, year, vinNumber); 
		this.setRaceStats(raceStats); 
	} // close non-default constructor 
	
	//set/mutator method
	public void setRaceStats(int raceStats) {
		this.raceStats = raceStats;
	} // close set
	 //get/accessor method
	public int getRaceStats() {
		return raceStats;
	} //close get
	
	
	//toString method
	public String toString() {
		String output = super.toString();
		output += "\nRace Stats: " + this.getRaceStats();
		return output; 
	} //close toString

} //close class
 