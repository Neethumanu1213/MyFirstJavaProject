
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 6;
		
		// pre increment operator
		num1 = ++num1 + num2; //(num1+1)+6 =6+6=12
		
		System.out.println(num1); //prints 12 

		// post increment operator
		num2 = num1++ + num2; // 12+6=18
		
		System.out.println(num2); //prints 18 ( but num1 value changes to 13)
		
		//pre decrement operator
		int num3=--num1+num2; // (13-1)+18=12+18=30
		
		System.out.println(num3); //prints 30
		
		//post decrement operator
		
		num3=num3--+ --num2; // 30+17=47
		System.out.println(num3); //prints 47 but after this poeration num1=12,num2=17
		num3++;
		System.out.println(num3);
	}

}
