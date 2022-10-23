package assignmentWeek7;

public class BankAccountDetails {
	String userName;
	String accountNumber;
	int pinNumber;
	double bankBalance;

	public BankAccountDetails(String Name, String accountNum, int pinNum, double balance) {

		accountNumber = accountNum;
		pinNumber = pinNum;
		bankBalance = balance;
		userName = Name;
	}

	double getBankBalance() {

		double currentBalance = bankBalance;
		System.out.println("Welcome " + userName + " Your current balance is " + currentBalance);
		return currentBalance;
	}

	double getPriceAfterWithdrawel(double amountToWithdraw) {
		double currentBalanceAfterWithdrawel = bankBalance - amountToWithdraw;
		return currentBalanceAfterWithdrawel;
	}

	double getPriceAfterDeposit(double amountToDeposit) {
		double currentBalanceAfterDeposit = bankBalance + amountToDeposit; 
		return currentBalanceAfterDeposit; 

	}

}
