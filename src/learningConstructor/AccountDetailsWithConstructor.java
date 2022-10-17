package learningConstructor;

public class AccountDetailsWithConstructor {
	String accountNumber="23456789";
	int pinNumber=3456;
	double balance=2300.234;
	
	AccountDetailsWithConstructor(){
		System.out.println("Updating the balance");
		
	}
	void balanceUpdates() {
		balance=balance+500;
		System.out.println("The current balance is "+balance);
	}

}
