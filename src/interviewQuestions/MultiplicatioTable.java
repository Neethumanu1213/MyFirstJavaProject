package interviewQuestions;

public class MultiplicatioTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int sum=0;
		System.out.println("Multiplication table of "+num);
		for(int i=1;i<=10;i++) {
			sum=i*num;
			System.out.println(String.format("%d * %d = %d", i,num,sum));
			
		}

	}

}
