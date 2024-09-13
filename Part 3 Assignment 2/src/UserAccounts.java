import java.util.Scanner;

public class UserAccounts {
    private Account[] accounts;

    // Constructs a new UserAccounts with 8 accounts and sets balance to 50
    public UserAccounts() {
        accounts = new Account[8];
        for (int i = 0; i < 8; i++) {
            accounts[i] = new Account(i + 1);
            accounts[i].setBalance(50);
        }
    }

    //Menu method to display options and handle user input
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        // While loop which will break upon the user entering 4
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1: Check balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }

            //Get account ID from user
            System.out.print("Enter account ID (1-8): ");
            int id = scanner.nextInt();

            //Get account object and checking if valid.
            Account account = accounts[id - 1];
            if (choice == 1) {
                System.out.println("The balance is " + account.getBalance());
            } else if (choice == 2) {
                //Deposit
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.depositAmount(amount);
                System.out.println("Deposit successful. New balance is " + account.getBalance());
            } else if (choice == 3) {
                //withdraw. check if balance is sufficient. if not print insufficient. else withdraw
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                if (amount > account.getBalance()) {
                    System.out.println("Insufficient balance");
                } else {
                    account.withdrawAmount(amount);
                    System.out.println("Withdrawal successful. New balance is " + account.getBalance());
                }
            }
        }
    }

    public static void main(String[] args) {
        UserAccounts accounts = new UserAccounts();
        accounts.displayMenu();
    }
}