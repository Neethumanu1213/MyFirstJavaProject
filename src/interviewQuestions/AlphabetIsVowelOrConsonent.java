//Write a program to Check Whether an Alphabet is Vowel or Consonant.

package interviewQuestions;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the alphabet");
		Scanner sc=new Scanner(System.in);
		String letter=sc.next();
		switch (letter.toLowerCase()) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("The letter is vowel");
			break;
		default:
			if(letter.charAt(0)>='a'&& letter.charAt(0)<='z') {
				System.out.println("This is a consonent");
				}else {
					System.out.println("Enter alphabets");
				}
			break; 
		}

	}

}
