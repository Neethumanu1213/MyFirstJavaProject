



public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Build a calculator application which uses switch case.
		char operator = '%';
		int number1 = 0;
		int number2 = 1;
		int result;
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println("The sum of " + number1 + " and " + number2 + " = " + result);
			break;
		case '-':
			result = number1 - number2;
			System.out.println("The difference of " + number1 + " and " + number2 + " = " + result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println("The product of " + number1 + " and " + number2 + " = " + result);
			break;
		case '/':
			if (number2 == 0) {
				System.out.println("The divisor should not be zero");
			} else {
				result = number1 / number2;
				System.out.println("The quotient of " + number1 + " and " + number2 + " = " + result);
			}
			break;
		case '%':
			if (number2 == 0) {
				System.out.println("The divisor should not be zero");
			} else {
				result = number1 % number2;
				System.out.println("The remaninder of " + number1 + " and " + number2 + " = " + result);
			}
			break;

		default:
			System.out.println("Enter valid operator");

			break;
		}

	}

}

