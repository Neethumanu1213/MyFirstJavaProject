package interviewQuestions;

import java.util.Scanner;

public class NumberIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int modulusNum = 0;
		int sum = 0;
		while (num > 0) {
			modulusNum = num % 10;
			sum = (sum * 10) + modulusNum;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("Is not a palindrome");
		}
	}

}
