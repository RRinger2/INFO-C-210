import java.util.ArrayList;


 public class Branch {
	private String branchAddress; 
	private String branchName; 
	private String branchPhoneNumber; 
	private ArrayList<Customer> branchCustomers = new ArrayList<Customer>(); 
	
	//default constructor 
	public Branch() {
		this.branchAddress = ""; 
		this.branchName = ""; 
		this.branchPhoneNumber = ""; 
		} // close default constructor
	
	//non-default constructor 
	public Branch(String branchAddress, String branchName, String branchPhoneNumber) {
		this.branchAddress = branchAddress; 
		this.branchName = branchName; 
		this.branchPhoneNumber = branchPhoneNumber;
	} // close non-default constructor 
	
	//set/mutator methods 
	public String setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress; 
		return branchAddress;
		} // close setBranchAddress 
	
	public String setBranchName(String branchName) {
		this.branchName = branchName; 
		return branchName;
		} // close setBranchName 
	
	public String setBranchPhoneNumber(String branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber; 
		return branchPhoneNumber;
		} // close setBranchPhoneNumber 
	
	//get/accessor methods 
	public String getBranchAddress() {
		return this.branchAddress; 
		} // close getBranchAddress 
	
	public String getBranchName() {
		return this.branchName; 
		} // close getBranchName 
	
	public String getBranchPhoneNumber() {
		return this.branchPhoneNumber; 
		} // close getBranchPhoneNumber 
	
	// method to add a customer
	protected void addCustomer(Customer customer) {
		branchCustomers.add(customer);
	} // close addCustomer 
	
	// method to remove a customer
	protected void removeCustomer(Customer customer) {
		branchCustomers.remove(customer);
	}
	
	public String toString() {
		String output = "Branch Name: " + this.branchName + "\n";
		output += "Branch Address: " + this.branchAddress + "\n";
		output += "Branch Phone Number: " + this.branchPhoneNumber + "\n";
		output += "\n";
		output += "Customers:\n";
		for (Customer customer : branchCustomers) {
			output += customer.toString() + "\n";
		}
		return output;
	}
} // close class
