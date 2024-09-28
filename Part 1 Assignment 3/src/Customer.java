
// need to add branch to customer object 

import java.util.ArrayList; 
import java.time.LocalDate;

public class Customer {
	//instance variables 
	private String name; 
	private String address; 
	private String phone; 
	private ArrayList<Account> customerAccounts = new ArrayList<Account>();
	
	
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
	public String setName(String name) {
		this.name = name; 
		return name;
		} // close setName 
	
	public String setAddress(String address) {
		this.address = address; 
		return address; 
		} // close setAddress
	
	public String setPhone(String phone) {
		this.phone = phone; 
		return phone; 
		} // close setPhone
	
	public ArrayList<Account> setCustomerAccounts(Account account){
		customerAccounts.add(account); 
		return customerAccounts;
	}
	
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
	
	public ArrayList<Account> getCustomerAccounts() {
		return customerAccounts;
	}
	
	public String toString() {
		String output = "Name: " + this.name + "\n"; 
		output += "Address: " + this.address + "\n"; 
		output += "Phone: " + this.phone + "\n"; 
		return output; 
		}
	
	} // close Customer Classs
