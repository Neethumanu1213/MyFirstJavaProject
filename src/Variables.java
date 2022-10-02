
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageNeethu = 32;
		String nameNeethu = "Neethu";

		System.out.println(ageNeethu);

		System.out.println(nameNeethu);

		System.out.println(ageNeethu + 1);

		ageNeethu = ageNeethu - 5;
		System.out.println(ageNeethu);

		// datatypes
		int num1 = 10;
		float num2 = 1.35f;
		double num3 = 1.34454;
		boolean isNum3Equalsnum2 = !false;
		System.out.println("Is num3 is equal to num1 :" + isNum3Equalsnum2);

		boolean isNum1GreaterThanEqualNum2 = num1 >= num2;
		System.out.println("Is num1 is greater than num2: " + isNum1GreaterThanEqualNum2);

		// comparing (num1>num2) and (num1=num2)
		System.out.println(isNum3Equalsnum2 == isNum1GreaterThanEqualNum2);
	}
}