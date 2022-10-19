package assignmentWeek7;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountDetails neethuAccount = new BankAccountDetails("Neethu", "1234500001", 6576, 105735.577);
		BankAccountDetails manuAccount = new BankAccountDetails("Manu", "1234500002", 5860, 105735.577);
		BankAccountDetails adithyaAccount = new BankAccountDetails("Adithya", "1234500003", 2906, 104735.577);
		BankAccountDetails vishnuAccount = new BankAccountDetails("Visnu", "1234500004", 8976, 105735.577);
		BankAccountDetails unniAccount = new BankAccountDetails("Unni", "12", 5120, 105735.577);
		Scanner sc = new Scanner(System.in);

		// array of object
		BankAccountDetails[] accountDetails = { neethuAccount, manuAccount, adithyaAccount, vishnuAccount,
				unniAccount };
		BankAccountDetails selectedAccount = null;
		double balanceAfterWithdraw = 0;
		double balanceAfterDeposit = 0;
		int flag = 0;
		int invalidCredentialCount = 0;
		while (invalidCredentialCount < 3) {
			System.out.println("Enter the Account Number");
			String accountNumEntered = sc.next();
			System.out.println("Enter the pinNumber");
			int pinEntered = sc.nextInt();

			// array iteration to find the account details of particular person
			for (int i = 0; i < accountDetails.length; i++) {

				if ((accountNumEntered.equals(accountDetails[i].accountNumber)
						&& (pinEntered == accountDetails[i].pinNumber))) {
					selectedAccount = accountDetails[i];

					selectedAccount.getBankBalance();

					flag = 1;

				}
			}
			// if flag is 1 the entered credential is valid
			if (flag != 0) {
				int invalidOptionCount = 0;
				do {
					System.out.println("Please enter 1 to Deposit or 2 to withdraw money");
					int selectedOption = sc.nextInt();

					if (selectedOption == 1) {
						System.out.println("Enter the amount you want to deposit");
						double amountToDeposit = sc.nextDouble();
						balanceAfterDeposit = selectedAccount.getPriceAfterDeposit(amountToDeposit);
						System.out.println("Balance after Deposit :" + balanceAfterDeposit);
						break;
					} else if (selectedOption == 2) {
						System.out.println("Enter the amount you want to withdraw");
						double amountToWithdraw = sc.nextDouble();
						if (amountToWithdraw > selectedAccount.bankBalance) {
							System.out.println("Insufficent balance");

						} else {
							balanceAfterWithdraw = selectedAccount.getPriceAfterWithdrawel(amountToWithdraw);
							System.out.println("Balance after Withdrawel " + balanceAfterWithdraw);
							break;
						}
					} else {
						System.out.println("Invalid option");
					}
					invalidOptionCount++;
				} while (invalidOptionCount < 3);

				if (invalidOptionCount > 2) {
					System.out.println("Maximum Limit exceded");
				}
				break;

			} else {
				System.out.println("Enter valid credentials");

			}
			invalidCredentialCount++;
		}

		if (invalidCredentialCount >= 3) {
			System.out.println("Please try again later");
		}
	}
}
