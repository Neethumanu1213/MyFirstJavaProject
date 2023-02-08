// Write a program to replace 2 number without using third variable.

package interviewQuestions;

public class ReplaceTwoNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=45;
		System.out.println(String.format("The numbers before swapping num1=%d and num2=%d",num1,num2));

		num1=num1+num2;   //num1*num2
		num2=num1-num2;   //num1/num2
		num1=num1-num2;   //num1/num2
		System.out.println(String.format("The numbers after swapping num1=%d and num2=%d",num1,num2));

		
		num1=num1-num2;//45-20=25
		num2=num2+num1;//20+25=45
		num1=num2-num1;//45-20=20
		System.out.println(String.format("The numbers after swapping num1=%d and num2=%d",num1,num2));

	}

}
