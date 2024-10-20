package finalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class BankOperator {
	
	public static Scanner scanner = new Scanner(System.in);
	
	InputMismatchException e = new InputMismatchException();
    
    public static ArrayList<Account> accounts = new ArrayList<Account>();
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
	DecimalFormat df = new DecimalFormat("#,###.00"); // format the balance to show as currency

   
	public static void main(String[] args) {
		Customer john = new Customer("122222", "John Jeffries");
    	RegularAccount account1 = new RegularAccount("123456", 2500.00, john);
    	accounts.add(account1); 
    	customers.add(john);
    	
    	Customer jane = new Customer("111111", "Jane Jeffries");
    	CheckingAccount account2 = new CheckingAccount("78765", 5000.00, jane);
		accounts.add(account2); 
		customers.add(jane);
    	
    	Customer bob = new Customer("133333", "Bob Barker");
    	GoldAccount account3 = new GoldAccount("12252", 10000.00, bob);
		accounts.add(account3); 
		customers.add(bob);
			
		//display created accounts
		System.out.println("Displaying created accounts."); 
		account1.displayInfo(); 
		account2.displayInfo();
		account3.displayInfo();
		
  	
		//deposit and withdraw from acount1
		
		System.out.println("Depositing $500 from Regular Account & then Withdrawing $200 from the same account.");
		account1.deposit(500.00);
		System.out.println("");
		account1.withdraw(200.00);
		System.out.println("");
		account1.displayInfo(); 
		
		System.out.println("Depositing $500 from Checking Account & then Withdrawing $200 from the same account.");
		account2.deposit(500.00);
		System.out.println("");
		account2.withdraw(200.00);
		System.out.println("");
		account2.displayInfo(); 
		
		System.out.println("Depositing $500 from Gold Account & then Withdrawing $200 from the same account.");
		account3.deposit(500.00);
		System.out.println("");
		account3.withdraw(200.00);
		System.out.println("");
		account3.displayInfo(); 
  	
		
		//run main menu function
		BankOperator bankOperator = new BankOperator();
		bankOperator.run();
	} //close main 
       
    //main menu function
    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("-----------------");
            System.out.println("Bank System Menu:");
            System.out.println("1. Create Checking Account");
            System.out.println("2. Create Gold Account");
            System.out.println("3. Create Regular Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Display Account Information");
            System.out.println("7. Remove Account");
            System.out.println("8. Apply End-of-Month Updates");
            System.out.println("9. Display Bank Statistics");
            System.out.println("10. Create a New Customer");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            System.out.println(" ");
            System.out.println("-----------------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            // Perform action based on choice with case
            switch (choice) {
                case 1 -> createChecking();
                case 2 -> createGold();
                case 3 -> createRegular();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> displayAccountInfo();
                case 7 -> removeAccount();
                case 8 -> applyEndOfMonthUpdates();
                case 9 -> displayStats();
                case 10 -> createCustomer(); 
                case 11 -> exit = true;
                default -> System.out.println("Invalid choice. Please try again.");
            } //close switch 
        } //close while 
	} //close run
    
    //method to create account 1st case
    private CheckingAccount createChecking() {
    	Customer customer = createCustomer(); 
		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();
		CheckingAccount newAccount = new CheckingAccount(accountNumber, 0, customer);
        accounts.add(newAccount);
        System.out.println("Checking account created.");
        newAccount.toString(); 
        return newAccount; 
    } //close createChecking

    //method to create gold account 2nd case
    private GoldAccount createGold() {
    	Customer customer = createCustomer(); 
		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();
		GoldAccount newAccount = new GoldAccount(accountNumber, 0, customer);
        accounts.add(newAccount);
        System.out.println("Gold account created.");
        newAccount.toString(); 
        return newAccount;
    }

    //method to create regular account 3rd case
    private RegularAccount createRegular() {
    	Customer customer = createCustomer(); 
		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();
		RegularAccount newAccount = new RegularAccount(accountNumber, 0, customer);
        accounts.add(newAccount);
        System.out.println("Regular account created.");
        newAccount.toString(); 
        return newAccount; 
    }
    //method to create customer with id and name
    private Customer createCustomer() {
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
		Customer newCustomer = new Customer(customerID, customerName);
        customers.add(newCustomer); 
		System.out.println("Customer created.");
		return newCustomer;  
	} //close createCustomer
    
    //Method to look up account and select
    public Account findAccount() {
    	System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account foundAccount = null;
      	
         for (Account account : accounts)
        	if (account.accountNumber.equals(accountNumber)) {
                foundAccount = account; 
                break; 
		    } if (foundAccount != null) {
		        return foundAccount; 
		    } else {
		    	return null; 
		    } //close if-else statement
      } //close findAccount 

    // method to deposit 4th case
    private void deposit() {
        Account account = findAccount();
        boolean valid;
        
        if (account != null) {
        	do { try {
            		System.out.print("Enter Deposit amount: ");
                	double amount = scanner.nextDouble();
					account.deposit(amount);
					valid = true;
				} catch (Exception e) {
					System.out.println("Amount must be a number.");
					scanner.nextLine();
					valid = false;
				} 
			} while (!valid); //close do-while
				} else {
					System.out.println("We were unable to locate that account."); 
        } //close if-else
    } //close deposit 

    // method to withdraw 5th case
    private void withdraw() {
        Account account = findAccount();
        boolean valid;
        
        if (account != null) {
        	do { try {
            		System.out.print("Enter Withdrawal amount: ");
                	double amount = scanner.nextDouble();
					account.withdraw(amount);
					valid = true;
				} catch (Exception e) {
					System.out.println("Amount must be a number.");
					scanner.nextLine();
					valid = false;
				} 
			} while (!valid); //close do-while
				} else {
					System.out.println("We were unable to locate that account."); 
        } //close if-else
    } //close withdraw 

    // method to display account info 6th case
    public void displayAccountInfo() {
		Account account = findAccount();
		if (account!=null) {
			System.out.println("Account Located.\n"); 
			account.displayInfo();
		} else {
			System.out.println("Account not found.");
		} //close if-else statement
    } //close displayAccountInfo 

    // method to remove account 7th case
    private void removeAccount() {
        Account account = findAccount();
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account removed.");
        } //close if statement 
		else {
			System.out.println("Account not found.");
		}
    } //close removeAccount 

    // method to apply end of month updates 8th case
    private void applyEndOfMonthUpdates() {
        for (Account account : accounts) {
			account.applyMonthEnd();
        }
        System.out.println(""); 
        System.out.println("End-of-month updates applied.");
    }
    
    private double calculateTotalBalance() {
	    double totalBalance = 0; 
        for (Account account : accounts) {
            totalBalance += account.balance;
		}
	    return totalBalance; 
    }
    private double calculateAverageBalance() {
    	double totalBalance = calculateTotalBalance();
	    double averageBalance = accounts.size() > 0 ? totalBalance / accounts.size() : 0; 
	    return averageBalance; 
    }

    // method to display bank statistics 9th case
    private void displayStats() {
        double totalBalance = calculateTotalBalance();
        double averageBalance = calculateAverageBalance();
        int zeroBalanceCount = 0;
        double largestBalance = 0;
        Account largestAccount = null;

        for (Account account : accounts) {
            if (account.balance == 0) {
                zeroBalanceCount++;
            }
            if (account.balance > largestBalance) {
                largestBalance = account.balance;
                largestAccount = account;
            }
        }

        System.out.println("Total balance: $" + df.format(totalBalance));
        System.out.println("Zero-balance accounts: " + zeroBalanceCount);
        System.out.println("Average balance: $" + df.format(averageBalance));
        System.out.println(""); 
        if (largestAccount != null) {
            System.out.println("Account with largest balance:");
            largestAccount.displayInfo();
        } //close if loop 
    } //close displayStats
} //close class