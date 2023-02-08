//Write a Program to Find Factorial of a Number


package interviewQuestions;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int sum=1;
		for(int i=5;i>0;i--) {
			sum=sum*i;
			
		}
		System.out.println("The factorial of "+num+" is :"+sum);
	
	int i=1;
	int result=1;
	while(i<num) {
		result=result*i;
		i++;		
	}
	System.out.println("The factorial of "+num+" is :"+sum);
	}
}
