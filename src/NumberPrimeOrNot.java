
public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check if the number is prime or not.

		int number = 13;
		boolean isPrimeNumber = false;  
		if ((number == 0) || (number == 1)) {
			System.out.println("0 and 1 are neither prime not composite");
		} else {
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					System.out.println(number + " is not a prime number");
					isPrimeNumber = true;
					break;
				}

			}
			if (!isPrimeNumber) {
				System.out.println(number + " is a prime number");
			}
		}

	}

}
