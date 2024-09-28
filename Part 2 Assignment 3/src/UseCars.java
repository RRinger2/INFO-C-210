import java.util.ArrayList;
import java.util.Scanner;



public class UseCars {
	
	//array list of Customers - independent of if they own a car or not. 
	public ArrayList<Person> customer = new ArrayList<Person>(); 
	
	public static void main(String[] args) {
		//the main method will call the displayMenu method and then we need to create a few cars & carOwners and display their information as well 
		
	} //close main 
	
	//display Menu method creates the user interface for the program
	public static void displayMenu() {
		
		boolean validInput = false; 	
	
		while (validInput = false) {
			Scanner in = new Scanner(System.in);
			
			//display menu
			System.out.println("Welcome to the Car Dealership. Please choose an option: ");
			System.out.println("1. Add a Customer");
			System.out.println("2. Add a car");
			System.out.println("3. Remove a car"); 
			System.out.println("4. Car Lookup"); 
			System.out.println("5. Quit");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Add a Customer");
				//should call addCustomer(); 
				break; 
			case 2:
				System.out.println("Add a car");
				//should call addCar();
				break;
			case 3:
				System.out.println("Remove a car");
				//should call removeCar();
				break;
			case 4: 
				System.out.println("Car Lookup");
				//should call carLookup();
				break;
			case 5:
				System.out.println("Menu Closed");
				System.out.println("Goodbye!"); 
				validInput = true;
				break;
			default:
				System.out.println("Invalid input. Please try again.");
				break;
				} // close switch
			}// close While(validInput = false)
		
	} //close displayMenu 
	
	//method to add a customer 
	public static void addCustomer() {
		// need to write print statements requesting customer info 
		// need to add customer to customer ArrayList
		
	} //close addCustomer
	
	//method to add a car 
	public static void addCar() {
		// need to write print statements requesting car type (Sports & Sedan) 
		//will call either addSportsCar or addSedan method depending on user input - Use the same switch statement above. 
	} //close addCar
	
	public static void addSportsCar() {
		//need to write print statements requesting car information 
		//need to add car to car ArrayList - customer.add(car); 
	} //close addSportsCar 
	public static void addSedan() {
		//need to write print statements requesting car information 
		//need to add car to car ArrayList - customer.add(car); 
	} //close addSedan 
	
	//method to remove a car 
	public static void removeCar() {
		//need to write print statements requesting customer first & then car information 
		//need to remove car from car ArrayList - customer.remove(car); 
	} //close removeCar
	
	//method to look up car 
	public static void carLookup() {
		//need to write print statements requesting customer first & then car information 
		//will need to iterate through customer.OwnedCars to find car with matching VIN number
		//need to print car information
	} //close carLookup	
} //close class
