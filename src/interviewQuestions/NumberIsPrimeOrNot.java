package interviewQuestions;

import java.util.Scanner;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//prime or not with flag
		int flag = 0;
		System.out.println("Enter the number to chrck prime or not ");
		int number = sc.nextInt();
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println("The number is not prime ");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("the number is prime");
		}
		
		
		
		//prime or not with boolean
		boolean isPrime=false;
		if((number==0)||(number==1)){
			System.out.println("The number 0 and 1 is neither prime or composite ");
		}else {
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {
					System.out.println("The number is not prime number");
					isPrime=true;
					break;
				}
			}
			if(!isPrime) {
				System.out.println("The number is a prime number");
			}
		}
	}
}
