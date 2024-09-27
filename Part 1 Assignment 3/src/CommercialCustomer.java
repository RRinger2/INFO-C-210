

public final class CommercialCustomer extends Customer {
	
	private int creditRating; 
	private String contactPerson; 
	private String contactPersonPhone;
	
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
