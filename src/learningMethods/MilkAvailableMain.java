package learningMethods;

import java.util.Scanner;

public class MilkAvailableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Is milk is available in store true/false");
		boolean milkAvailable = sc.nextBoolean();

		// creating instance of class using reference variable
		MilkAvailableCheck milkAvailableCheck = new MilkAvailableCheck();

		// invoking the method using reference variable and assigning to a boolean
		// variable
		boolean milkCheck = milkAvailableCheck.isMilkAvailable(milkAvailable);
		System.out.println("Milk available is "+milkCheck);
	}

}
