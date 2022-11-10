package assignmentWeek9;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuessTheSudentGame {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int retryCount = 0;
		do {

			String path = "C:\\Users\\manea\\OneDrive\\Desktop\\NameList.txt";
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			long linesOfFile = Files.lines(Paths.get(path)).count();
			String[] nameList = new String[(int) linesOfFile];
			String line;
			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				nameList[count] = line;
				count++;
			}

			// creating instance of random class and finding the name using index
			Random random = new Random();
			int randomindex = random.nextInt(nameList.length);
			String studentName = nameList[randomindex];

			// creating instance of class and invoking the parameterized constructor
			GameDetails gameDetails = new GameDetails(studentName, 5);

			// calling the method 
			gameDetails.gameProcess(); 

			// giving options to start new game
			System.out.println("Do you want to play again. Press Y to continue or any other letter to come out");
			String optionSelected = sc.next();
			if (optionSelected.equalsIgnoreCase("y")) {
				retryCount++;
			} else {
				System.out.println("Thank you for playing see you later !");
				System.exit(retryCount);
			}
		} while (retryCount > 0);
	}

}
