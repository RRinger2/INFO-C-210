import java.util.ArrayList;

public final class PersonalCustomer extends Customer {
	private String homePhone; 
	private String workPhone;
	
	//ArrayList to hold all accounts owned by the Customer
	protected ArrayList<Account> customerAccounts = new ArrayList<Account>(); 
	
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
	
	public ArrayList<Account> setCustomerAccounts(Account account){
		customerAccounts.add(account); 
		return customerAccounts;
	}
	
	//get methods 
	public String getHomePhone() {
		return homePhone;
	} //close getHomePhone
	
	public String getWorkPhone() {
		return workPhone;
	} //close getWorkPhone
	
	public ArrayList<Account> getCustomerAccounts() {
		return customerAccounts;
	}
	
	protected void addAccount(Account account) {
		customerAccounts.add(account);
	}
	
	// method to remove a account
	protected void removeAccount(Account account) {
		customerAccounts.remove(account);
	} // close addAccount
	
	public String toString() {
		String output = "Customer Type: Personal Customer\n";
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
