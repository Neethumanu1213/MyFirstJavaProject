package assignmentWeek9;

import java.util.Scanner;

public class GameDetails {
	private String studentName;
	private int wrongAttempts;
	private int maxWrongAttempts;
	private String wrongCharacter;
	private String maskedName;

	Scanner sc = new Scanner(System.in);

	public GameDetails(String studentName, int maxWrongAttempts) {

		this.studentName = studentName;
		this.maxWrongAttempts = maxWrongAttempts;
		this.wrongAttempts = 0;
		this.wrongCharacter = " ";
		this.maskedName = studentName.replaceAll("\\w", "*");
		System.out.println("                     Welcome to the game show                ");
		System.out.println("Let's start the game \n");
	} 

	public void validatingGuessedCharacter(String inputChar) {
		boolean isInputCharContain=false;
		for (int i = 0; i < studentName.length(); i++) {
			
			if (studentName.toUpperCase().charAt(i) == inputChar.toUpperCase().charAt(0)) {
				maskedName = maskedName.substring(0, i) + studentName.charAt(i) + maskedName.substring(i + 1);
			isInputCharContain=true;
			}
		}
		if(maskedName.contains(inputChar)) {
			System.out.println("The letter is already entered");
			isInputCharContain=true;
		
		}else if (!isInputCharContain) {
			wrongAttempts++;
			wrongCharacter = wrongCharacter + " " + (inputChar);
		}
	}

	public void gameProcess() {
		while (wrongAttempts < maxWrongAttempts) {

			System.out.println("You are guessing " + maskedName);
			System.out.println("You have guessed " + wrongAttempts + " letters wrong " + wrongCharacter + "\n");

			System.out.println("Enter the charactor for guessing ");
			String inputChar = sc.next();

			validatingGuessedCharacter(inputChar);

			if (studentName.equals(maskedName)) {
				System.out.println("You win" + "\n" + "You have  guessed the name " + studentName + " correctly");
				break;
			}
		}
		if (wrongAttempts == maxWrongAttempts) {
			System.out.println("You have reached maximum wrong attempt ");
		}
	}
}
