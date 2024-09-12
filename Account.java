import java.util.Scanner;
//i get a lot errors when I try to run it but I hope thats mostly due to it needing some code from part 1
public class Account {
//Im not sure if we just hand in these files in pieces or combine code since this derives from part 1. I hope not because thatd be easier to not have to join the codes
    private Account[] accounts;
//also I'll be sure to delete the comments asking for help to clean it up
    public Account() {
//creates 8 accounts number 0-7 and sets their balance to 50
        accounts = new Account[8];
        for (int i = 0; i < 8; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i + 1);
            accounts[i].setBalance(50);
        }
    }
//might have trouble with this line 
    public double getBalance(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account.getBalance();
            }
        }
        return 0.0;
    }
//some of these lines are from part 1 code but with added function as requested, however not all of part 1's code is here because not all pertains to this part so I thought it was easier to have not needed code out of the way
    public double withdraw (double withdrawAmount) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.setBalance(account.getBalance() - amount);
            }
        }
    }
//let me know if there was a better way to do these last 2 lines, i guarantee there is
   public double deposit (double depositAmount) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.setBalance(account.getBalance() + amount);
            }
        }
    }

    public static void main(String[] args) {
// the menu as I call it. prompts the user with 4 options to choose. you first enter the ID number then you can access the menu and its functions
        UserAccounts accounts = new UserAccounts();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id = scanner.nextInt();
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
//upon choosing option 4, the user should be prompted again to enter another ID and program runs forever as requested
            if (choice == 4) {
                break;
            }
            if (choice == 1) {
                System.out.println("The balance is " + accounts.getAccountBalance(id));
                continue;
            }
            if (choice == 2) {
                System.out.print("Enter an amount to withdraw: ");
                double amount = scanner.nextDouble();
                accounts.withdrawAmount(amount, id);
            }
//these are the functions to withdraw and deposit and should work when asked for a balance check
            if (choice == 3) {
                System.out.print("Enter an amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                accounts.depositAmount(depositAmount, id);
            }
            

        }

    }
}
