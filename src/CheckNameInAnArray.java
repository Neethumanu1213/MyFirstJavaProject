import java.util.Scanner;

public class CheckNameInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] nameList = new String[4];
		
		//To take input from console
		System.out.println("Enter the names");
		for (int i = 0; i < nameList.length; i++) {
			nameList[i] = sc.next();
		}
		
		//to print the entered names
		System.out.println("The entered names are :");

		for (int i = 0; i < nameList.length; i++) {

			System.out.println(nameList[i]);
		}
		
		// To check the name is present or not
		int count = 0;
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].equals("Neethu")) {
				count++;
				
			}
		}
		System.out.println("Neethu is present " + count + " times in the array");
		
	}

}
