package assignmentWeek7;

import java.util.Scanner;

public class CruiceCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(
//				"Please press Y if you want to continue with the selection or press any other alphabet to select another");
//
//		System.out.println("Enter the number of adults");
//		System.out.println("Enter the number of children");
//		System.out.println("Enter the age of child 1");
//		System.out.println(
//				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");

		CruiceDetails scenicCruise = new CruiceDetails("Scenic Cruise", 3);
		CruiceDetails sunsetCruise = new CruiceDetails("Sunset Cruise", 1);
		CruiceDetails discoveryCruise = new CruiceDetails("Discovery Cruise", 4);
		CruiceDetails mysteryCruise = new CruiceDetails("Mystery Cruise", 2);

		CruiceDetails[] cruiceDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		Scanner sc = new Scanner(System.in);
		String cruiseSelection;
		for (int i = 0; i < cruiceDetails.length; i++) {
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select."
						+ "\n" + "Scenic Cruise" + "\n" + "Sunset Cruise" + "\n" + "Discovery Cruise" + "\n"
						+ "Mystery Cruise");
		String enteredNameOfcruise = sc.nextLine();
		//int flag=0;
		
			if (enteredNameOfcruise.equals(cruiceDetails[i].cruiseName)) {
				
				cruiceDetails[i].getCruiceDetais(enteredNameOfcruise);

			} 

		
//		if(flag==0) {
//			System.out.println("Enter valid Cruise name");
//			System.exit(flag);
//		}

		
		System.out.println(
				"Please press Y if you want to continue with the selection or press any other alphabet to select another");
		cruiseSelection = sc.nextLine();
		int count=0;
		
			}
	}
		
	}


