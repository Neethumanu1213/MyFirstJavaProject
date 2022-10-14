package learningMethods;

import java.util.Scanner;

public class LicenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current license");
		String currentLicense=sc.next();
		
		//instantiating the method class
		LicenceMethod licenseM=new LicenceMethod();
		
		//invoking the method class using refernce variable
		 String licenseToBeApplied=licenseM.licenseToBeApplied(currentLicense);
		
		
		switch (licenseToBeApplied) {
		case "G1":
			System.out.println("You need to pay $ 90");
			break;
		case "G2":
			System.out.println("You need to pay $ 120");
			break;
		case "G":
			System.out.println("You need to pay $150");
			break;
		case "You alreay have liscence":
			System.out.println("You can go home");
			break;

		default:
			System.out.println("Valid input");
			break;
		}
	}

}
