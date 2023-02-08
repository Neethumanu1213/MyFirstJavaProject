// Write a program to find the length of a string.

package interviewQuestions;

import java.util.Scanner;

public class FindTheLengthOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String sentence=sc.nextLine();
		int lengthOfString=sentence.length();
		System.out.println("The length of the string is "+lengthOfString);
		
		System.out.println("Enter aother string");
		String enteredSentence=sc.nextLine();
		String sentenceWithoutSpace=enteredSentence.replace(" ", "");
		int length=sentenceWithoutSpace.length();
		System.out.println("The length of the sentance without space "+length);

	}

}
