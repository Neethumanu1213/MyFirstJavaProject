//Write a Program to Calculate the Power of a Number

package interviewQuestions;

public class CalculateThePowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int powerOfNum=1;
		for(int exponent=3;exponent>0;exponent--) {
			powerOfNum=powerOfNum*num;
		}
		System.out.println(" Power of "+num +" is :"+powerOfNum);

	}

}
