package lab8;

public class SavingsAccount extends Account {
		
	//Default savings account
	public SavingsAccount() {
		super(); 
	}

	//Specific savings account
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	//Withdraw of savings 
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		} else
			System.out.println("Overdrawn transaction from savings.");
		}
}


