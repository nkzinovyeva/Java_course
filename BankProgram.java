package JavaBankApplication;

//************************************************************************
//BankProgram.java	 Template created on 15.9.2016
//- The program class for the BankApplication exercise
//************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankProgram {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();
	private static DecimalFormat twoDecimals = new DecimalFormat("0.00");

	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println("Number: " + accountList.get(i).getAccountNumber() + " | Balance: "
					+ twoDecimals.format(accountList.get(i).getBalance()) + " euros");
		}
	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) == null) {
			Account account = new Account(accountNumber);
			accountList.add(account);
			System.out.println("\nAccount created successfully!");
		} else {
			System.out.println("\nAccount not created. Account " + accountNumber + " exists already!");
		}
	}

	private static Account findAccount(String accountNumber) {
		Account myAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				myAccount = accountList.get(i);
			}
		}
		return myAccount;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) != null) {
			System.out.print("Enter the amount to be deposited: ");
			double amount = Double.parseDouble(input.nextLine().replace(',', '.'));
			if (amount > 0) {
				findAccount(accountNumber).deposit(amount);
				System.out.println("\nDeposit completed successfully!");
			} else {
				System.out.println("\nCannot deposit a negative amount!");
			}
		} else {
			System.out.println("\nAccount " + accountNumber + " does not exist!");
		}
	}

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) != null) {
			System.out.print("Enter the amount to be withdrawn: ");
			double amount = Double.parseDouble(input.nextLine());
			if (amount > 0) {
				findAccount(accountNumber).withdraw(amount);
			} else {
				System.out.println("\nCannot withdraw a negative amount!");
			}
		} else {
			System.out.println("\nAccount " + accountNumber + " does not exist!");
		}
	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) != null) {
			accountList.remove(findAccount(accountNumber));
			System.out.println("\nAccount deleted successfully!");
		} else {
			System.out.println("\nNothing deleted. Account " + accountNumber + " does not exist!");
		}
	}
}
//End
