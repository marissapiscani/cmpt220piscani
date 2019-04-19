package lab8;

public class Lab8_2 {
	public static void main(String[] args) {
			// Create Account, SavingsAccount and Checking Account objects
			Account account = new Account(105, 15000);
			SavingsAccount savings = new SavingsAccount(101, 19000);
			CheckingAccount checking = new CheckingAccount(111, 25000, 100);
			
			// Set annual interest rate of 4.5%
			account.setAnnualInterestRate(3.5);
			savings.setAnnualInterestRate(3.5);
			checking.setAnnualInterestRate(3.5);

			// Withdraw $2,500
			account.withdraw(2500);
			savings.withdraw(1000);
			checking.withdraw(500);

			// Deposit $3,000
			account.deposit(3000);
			savings.deposit(6000);
			checking.deposit(2000);

			// Invoke toString methods
			System.out.println(account.toString());
			System.out.println(savings.toString());
			System.out.println(checking.toString());
		}
	}



