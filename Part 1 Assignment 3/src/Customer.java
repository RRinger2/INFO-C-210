
// need to add branch to customer object 

import java.util.ArrayList; 
import java.time.LocalDate;

public class Customer {
	//instance variables 
	private String name; 
	private String address; 
	private String phone; 
	
	//ArrayList to hold all accounts owned by the Customer
	protected ArrayList<Account> customerAccounts = new ArrayList<Account>(); 

	
	//default constructor 
	public Customer() {
		this.name = ""; 
		this.address = ""; 
		this.phone = ""; 
		} // close default constructor 
	
	//non-default constructor 
	public Customer(String name, String address, String phone) {
		this.name = name; 
		this.address = address; 
		this.phone = phone;
		} // close non-default constructor 
	
	//set/mutator methods 
	public void setName(String name) {
		this.name = name; 
		} // close setName 
	
	public void setAddress(String address) {
		this.address = address; 
		} // close setAddress
	
	public void setPhone(String phone) {
		this.phone = phone; 
		} // close setPhone
	
	//get/accessor methods 
	public String getName() {
		return this.name; 
		} // close getName 
	
	public String getAddress() {
		return this.address; 
		} // close getAddress
	
	public String getPhone() {
		return this.phone; 
		} // close getPhone
	
	protected void addAccount(Account account) {
		customerAccounts.add(account);
	} // close addAccount
	
	// method to remove a account
	protected void removeAccount(Account account) {
		customerAccounts.remove(account);
	} // close addAccount
	
	public String toString() {
		String output = "Name: " + this.name + "\n"; 
		output += "Address: " + this.address + "\n"; 
		output += "Phone: " + this.phone + "\n"; 
		output +="\n"; 		
		//loops through each account and prints it out
		return output; 
		}
	
	} // close Customer Classs
