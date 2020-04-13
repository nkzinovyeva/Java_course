
public class Account {
	private String accountNumber;
	private double balance;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withdraw (double amount) {
		if (balance > 0 && balance >= amount) {
			System.out.println("\nWithdrawal completed successfully!");
			this.balance = balance - amount;
			return true;
		} else {
			System.out.println("\nWithdrawal not completed. Available balance is too low.");
			return false;
		}
	}
}
