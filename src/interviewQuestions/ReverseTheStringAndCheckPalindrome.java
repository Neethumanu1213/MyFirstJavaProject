package interviewQuestions;

import java.util.Scanner;

public class ReverseTheStringAndCheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check palindrome or not ");
		String  enteredString=sc.nextLine();
		String reverse="";
		for(int i=enteredString.length()-1;i>=0;i--) {
			reverse=reverse+enteredString.charAt(i);
		}
		if(reverse.equalsIgnoreCase(enteredString)) {
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The string is not a palindrome");
		}

	}

}
