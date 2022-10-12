import java.util.Scanner;

public class LearningScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third number");
		num3 = sc.nextInt();
		
		int sum=num1+num2+num3;
		System.out.println("The sum of number is "+sum);
	}

}
