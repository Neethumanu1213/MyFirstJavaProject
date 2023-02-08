//Write a Program to Display Factors of a Number.
//Factor a number or algebraic expression that divides another number or expression evenly
//i.e., with no remainder.

package interviewQuestions;

public class FactorsOfAnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 60;
		System.out.println("The factors of " + num + " is :");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				int factors = i;
				System.out.print(factors + " ");

			}

		}

	}

}
