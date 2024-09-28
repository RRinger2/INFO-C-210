

public final class PersonalCustomer extends Customer {
	private String homePhone; 
	private String workPhone;
	
	//constructor
	public PersonalCustomer(String name, String address, String phone, 
			String homePhone, String workPhone) {
		super(name, address, phone);
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}// close constructor
	
	//set methods 
	public String setHomePhone() {
		return homePhone;
	} //close setHomePhone
	
	public String setWorkPhone() {
		return workPhone;
	} //close setWorkPhone
	
	//get methods 
	public String getHomePhone() {
		return homePhone;
	} //close getHomePhone
	
	public String getWorkPhone() {
		return workPhone;
	} //close getWorkPhone
	
	public String toString() {
		String output = "Account Type: Personal Customer\n";
		output += super.toString();
		output += "Home Phone: " + this.homePhone + "\n"; 
		output += "Work Phone: " + this.workPhone + "\n"; 
		output += "\n"; 
		output += "Accounts:\n";
		for (Account account : customerAccounts) {
			output += account.toString() + "\n";
		}
		return output;
		
	}
}
