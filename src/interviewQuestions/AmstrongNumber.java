//Write a Program to Check Armstrong Number
//153=1*1*1+5*5*5+3*3*3

package interviewQuestions;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		int temp=num;
		double sum=0;
		int count=0;
		int tempMod=0;

		while(temp>0) {
			temp=temp/10;
			count++;		
		}
		temp=num;
		while(temp>0) {
			tempMod=temp%10;
			sum=sum+Math.pow(tempMod, count);
			temp/=10;
			
		}
		if(sum==num) {
			System.out.println("The number is an amstrong number");
		}else {
			System.out.println("The number not an amstrong number");
		}
	}

}
