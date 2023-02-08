package javaInterview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letter="A";
		switch (letter.toLowerCase()) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("The letter is vowel");
			break;

		default:
			if((letter.charAt(0)>='a')&&(letter.charAt(0)<='z')) {
			System.out.println("The letter is not a vowel");
			}else {
				System.out.println("Enter charecter");
			}
			break;
		}
	}

}
