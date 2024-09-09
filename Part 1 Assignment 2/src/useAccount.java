

public class useAccount {

    //main method
    public static void main(String[] args) {

        Account acc1 = new Account(1122, 20000, 4.5);

        System.out.println(acc1);

        System.out.println("The Monthly Interest Rate is: " + acc1.getMonthlyInterestRate() + "%.");
        System.out.println("The Monthly Interest is: $" + acc1.getMonthlyInterest());


    }//end main

} //end useAccount