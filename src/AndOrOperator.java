
public class AndOrOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Number 1 is greatest number");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Number 2 is greatest");

		}else {
			System.out.println("Number 3 is greatest");
		}

	}

}
