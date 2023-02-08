package interviewQuestions;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
			
		}
		System.out.println(String.format("The sum of %d natural numbers are %d",num,sum));

	}

}
