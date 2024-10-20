# INFO-C-210
Slightly Above Average Team Repo - Bank Operator Program

UML 
+-------------------------------------+
|            finalProject             |
|-------------------------------------|
| + BankOperator                      |
|   - accounts: ArrayList<Account>   |
|   - customers: ArrayList<Customer> |
|   - scanner: Scanner               |
|   + main(args: String[]): void     |
|   + run(): void                    |
|   + createChecking(): CheckingAccount|
|   + createGold(): GoldAccount      |
|   + createRegular(): RegularAccount |
|   + createCustomer(): Customer      |
|   + findAccount(): Account          |
|   + deposit(): void                 |
|   + withdraw(): void                |
|   + displayAccountInfo(): void      |
|   + removeAccount(): void           |
|   + applyEndOfMonthUpdates(): void  |
|   + calculateTotalBalance(): double |
|   + calculateAverageBalance(): double|
|   + displayStats(): void            |
|                                     |
| + Account (abstract)               |
|   - accountNumber: String          |
|   - balance: double                |
|   - customer: Customer             |
|   + deposit(amount: double): void   |
|   + withdraw(amount: double): void  |
|   + displayInfo(): void             |
|   + applyMonthEnd(): void           |
|                                     |
| + RegularAccount                   |
|                                     |
| + CheckingAccount                  |
|                                     |
| + GoldAccount                      |
|                                     |
| + Customer                         |
|   - customerID: String             |
|   - customerName: String           |
|   + Customer(customerID: String, customerName: String) |
+-------------------------------------+

Overview
The Bank Operator program is a simple console-based application designed to manage bank accounts and customers. It allows users to create different types of accounts, perform transactions, apply month end fees to existing accounts  and view account information.

Features
Create Checking, Gold, and Regular accounts
Create new customers
Deposit and withdraw funds
Display account information
Remove accounts
Apply end-of-month updates
Display bank statistics

Usage
Upon running the program, you will be presented with a menu of options. You can choose from the following:

Create Checking Account: Opens a new checking account for a customer.
Create Gold Account: Opens a new gold account for a customer.
Create Regular Account: Opens a new regular account for a customer.
Deposit: Locates an existing account using the findAccount method and then Adds funds to an existing account.
Withdraw: Locates an existing account using the findAccount method and thenRemoves funds from an existing account.
Display Account Information: Locates an existing account using the findAccount method and then simplehows details of the located account.
Remove Account: Locates an existing account using the find Account method and then Deletes the located account from the system. 
Apply End-of-Month Updates: Applies monthly updates to all accounts, such as interest and fees.
Display Bank Statistics: Shows total and average balances, zero-balance accounts, and the account with the largest balance.
Create a New Customer: Adds a new customer to the bank system.
Exit: Closes the program.

Classes
BankOperator: Main class that handles user inputs and program flow.
Account: Base class for different account types.
Customer: Represents a bank customer.
RegularAccount, CheckingAccount, GoldAccount: Subclasses of Account, each with specific features.

Account Operations
Deposit: Adds a specified amount to the account balance.
Withdraw: Deducts a specified amount from the account balance, if sufficient funds are available or the account type allows indefinite withdrawals.
DisplayInfo: Prints account details.
ApplyMonthEnd: Applies monthly interest or fees depending on the account type. 

Design and Implementation Assumptions
Anyone utilizing this program is authorized to access the account details and transact within the accounts. 
Any transaction taking place would occur separate from the creation of the account and customer objects. 
Any new account being created will have a unique account number. 

Challenges Faced
Properly implementing the findAccount() method, as many subsequent methods in the BankOperator class depend on this method to locate an account that will be transacted upon. 
Properly implementing the displayAccountInfo method as the main method is static void and the initial toString method provides a return value. 
Properly catching any exceptions that may have occured. Majority of the exceptions that would occur were handled with if else statements; aside from the the deposit and withdraw methods in the BankOperator Class. 

Known Bugs 
If an account is created with a duplicate account number, the system allows it but the account can not be located later or displayed, even within the same run. 
Multiple transactions cannot occur consecutively without locating the account before each transaction. 

Specific Procedures
When running the program, the pre-created accounts within the Main method will always exist. 
At this time, there is no implementation for storing object instances outside of the current run. 