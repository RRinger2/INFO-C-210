package finalProject;

public class BankOperator {
	
	//instance variables
	private String operatorName; 
	private String operatorID; 
	
	//default constructor
	public BankOperator() {
		this.operatorName = "";
		this.operatorID = "";
	} //close default constructor 
	
	//non-default constructor
	public BankOperator(String operatorName, String operatorID) {
		this.operatorName = operatorName;
		this.operatorID = operatorID;
	} //close non-default constructor 
	
	//set/mutator methods
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	} //close setOperatorName
	
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	} //close setOperatorID
	
	//get/accessor methods
	public String getOperatorName() {
		return operatorName;	
	} //close getOperatorName
	
	public String getOperatorID() {
		return operatorID;
	} //close getOperatorID
	
	//toString method
	public String toString() {
		String output = "";
		output += "Operator Name: " + operatorName + "\n";
		output += "Operator ID: " + operatorID + "\n";
		return output;
	} //close toString
	
} //close class
