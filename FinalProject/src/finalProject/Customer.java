package finalProject;

public class Customer {

	private String customerID; 
	private String customerName;
	
	//default constructor
	public Customer() {
		this.customerID = "";
		this.customerName = "";
	} //close default constructor
		
	//non-default constructor
	public Customer(String customerID, String customerName) {
		this.customerID = customerID; 
		this.customerName = customerName; 
	} //close non-default constructor 
	
	//set/mutator methods
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	} //close setCustomerID
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}//close setCustomerName
	
	//get/accessor methods
	public String getCustomerID() {
		return this.customerID;
	} //close getCustomerID
	
	public String getCustomerName() {
		return this.customerName;
	} //close getCustomerName
	
	//toString method
	public String toString() {
		String output = "Customer ID: " + customerName + "\n";
		output += "Customer Name: " + customerID + "\n";
		return output;
	} //close toString
	
	public void displayInfo() {
		System.out.println(this.toString()); 
	}
	
} // close class
