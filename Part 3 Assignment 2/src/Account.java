import java.util.Scanner;

public class Account {
    //Im not sure if we just hand in these files in pieces or combine code since this derives from part 1. I hope not because thatd be easier to not have to join the codes
    private final Account[] accounts;

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
    public double getAccountBalance(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account.getBalance();
            }
        }
        return 0.0;
    }
    //some of these lines are from part 1 code but with added function as requested
    public void withdrawAmount(double amount, int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.setBalance((int) (account.getBalance() - amount));
            }
        }
    }
    //let me know if there was a better way to do these last 2 lines, i guarantee there is
    public void depositAmount(double amount, int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.setBalance((int) (account.getBalance() + amount));
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
//if someone can identify whats the deal with these lines of code I'd appreciate it
    private void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setBalance(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}