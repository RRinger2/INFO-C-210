
public class Customer {
	//instance variables 
	private String name; 
	private String address; 
	private String phone; 
	
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
	
	} // close Customer Classs
