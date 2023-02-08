package interviewQuestions;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rock or paper or scissor");
		String userInput1=sc.next();
		System.out.println("Enter the Rock or paper or scissor");
		String userInput2=sc.next();
		if(userInput1.equalsIgnoreCase(userInput2)){
			System.out.println("Its a tie");
		}else if((userInput1.equalsIgnoreCase("Rock"))&&(userInput2.equalsIgnoreCase("paper"))){
			System.out.println(userInput2+" wins");
		}else if((userInput1.equalsIgnoreCase("Rock"))&&(userInput2.equalsIgnoreCase("scissor"))){
			System.out.println(userInput1+" wins");
		}else if((userInput1.equalsIgnoreCase("paper"))&&(userInput2.equalsIgnoreCase("scissor"))){
			System.out.println(userInput2+" wins");
		}else {
			
			System.out.println("Enter valid input");
		}
			
		
		

	}

}
