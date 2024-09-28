import java.util.ArrayList;

public final class CommercialCustomer extends Customer {
	
	private int creditRating; 
	private String contactPerson; 
	private String contactPersonPhone;
	//ArrayList to hold all accounts owned by the Customer
	protected ArrayList<Account> customerAccounts = new ArrayList<Account>(); 

	
	//constructor
	public CommercialCustomer(String name, String address, String phone, 
			int creditRating, String contactPerson, String contactPersonPhone) {
		super(name, address, phone);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPersonPhone = contactPersonPhone;
	} //close constructor 
	
	//set methods 
	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	} //close setCreditRating 
	
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	} //close setContactPerson
	
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	} //close setContactPersonPhone
	
	public ArrayList<Account> setCustomerAccounts(Account account){
		customerAccounts.add(account); 
		return customerAccounts;
	}
	
	//get methods
	public int getCreditRating() {
		return creditRating;
	} //close getCreditRating
	
	public String getContactPerson() {
		return contactPerson;
	} //close getContactPerson
	
	public String getContactPersonPhone() {
		return contactPersonPhone;
	} //close getContactPersonPhone
	
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
		String output = "Customer Type: Commercial\n"; 
		output += super.toString();
		output += "Credit Rating: " + this.creditRating + "\n"; 
		output += "Contact Person: " + this.contactPerson + "\n"; 
		output += "Contact Person Phone: " + this.contactPersonPhone + "\n"; 
		output += "\n"; 
		output += "Accounts:\n";
		for (Account account : customerAccounts) {
			output += account.toString() + "\n";
		}
		return output;
	} //close toString 
} // close class
