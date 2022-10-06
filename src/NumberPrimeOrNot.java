

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check if the number is prime or not.

		int number = 10;
		boolean isPrimeNumber = true;
		for (int counter = 2; counter <= number / 2; counter++) {
			if (number % counter == 0) {
				System.out.println(number + " is not a prime number");
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(number + " is a prime number");
		}

	}

}
