

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program which prints the multiplication table of a number.

		int multiplicantNumber = 8;

		System.out.println("The multiplication table of " + multiplicantNumber);
		for (int multiplier = 1; multiplier <= 10; multiplier++) {
			int multiplicationResult = multiplier * multiplicantNumber;
			System.out.println(multiplier + " * " + multiplicantNumber + " = " + multiplicationResult);

		}

	}

}
