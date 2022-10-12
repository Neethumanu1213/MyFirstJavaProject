import java.util.Scanner;

public class CheckNameInAnArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// printing size of an array
		System.out.println("Enter the size of an array");
		int sizeOfArray = sc.nextInt();

		// Printing the names in an array
		String[] nameList = new String[sizeOfArray];

		// Taking input from console
		System.out.println("Enter the names");
		for (int i = 0; i < sizeOfArray; i++) {
			nameList[i] = sc.next();
		}

		// To print entered name
		System.out.println("The entered names are :");

		for (int i = 0; i < sizeOfArray; i++) {
 
			System.out.println(nameList[i]);
		}

		// check Neethu is present or not and how many times
		int counter = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (nameList[i].equals("Neethu")) {
				counter++;
			}

		}
		if (counter > 0) {
			System.out.println("Neethu is present  " + counter + " times in this array.");
		} else {
			System.out.println("Neethu is not present");
		}
	}
}
