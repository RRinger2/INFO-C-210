
import java.time.LocalDate; 

public class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance, LocalDate dateOpened, double annualInterestRate) {
		super(accountNumber, balance, dateOpened);
	}
}
