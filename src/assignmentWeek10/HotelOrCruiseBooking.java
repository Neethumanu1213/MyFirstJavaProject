package assignmentWeek10;

import java.util.Scanner;

public class HotelOrCruiseBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		UserDetails userDetails = new UserDetails();
		ScenicCruise scenicCruise = new ScenicCruise("Scenic Cruise", 3, 43.99, 12.99, 50,"Spa");
		SunsetCruise sunsetCruise = new SunsetCruise("Sunset Cruise", 1, 52.99, 13.99, 45,"Candlelight Dinner");
		DiscoveryCruise discoveryCruise = new DiscoveryCruise("Discovery Cruise", 4, 39.99, 9.99, 50,"Adventure Games");
		MysteryCruise mysteryCruise = new MysteryCruise("Mystery Cruise", 2, 45.99, 12.99, 20,"Casino");
		DeluxSuites deluxSuites = new DeluxSuites("Delux Suites", 180);
		FamilySuites familySuites = new FamilySuites("Family Suites", 230);
		CruiseBookingDetails[] cruiseBookingDetail = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		HotelBookingDetails[] hotelBookingDetails = { deluxSuites, familySuites };

		System.out.println("Welcome ");
		System.out.println("Please sign up to book a service");
		userDetails.userRegisteration();
		System.out.println("Thank you for registering");
		userDetails.validateUserCredentials();
		String optionForContinue = "";
		do {
			int invalidTryCount = 0;
			System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
			String selectedService = sc.nextLine();
			do {
				if (selectedService.equalsIgnoreCase("Hotel Stay")) {
					System.out.println(
							"We offer two different suite packages.Please enter the room you want to select from below options."
									+ "\nDelux Suites: accommodates 2 adults and 2 children at the rate of $180/ night"
									+ "\nFamily Suites: accommodates 4 adults and 4 children at $230/ night.");
					String enteredNameOfSuite = sc.nextLine();
					for (int i = 0; i < hotelBookingDetails.length; i++) {
						if (enteredNameOfSuite.equals(hotelBookingDetails[i].getNameOfSuite())) {
							if (hotelBookingDetails[i].getNameOfSuite().equals(deluxSuites.getNameOfSuite())) {
								deluxSuites.setNumOfAdultAndChild();
							} else if (hotelBookingDetails[i].getNameOfSuite().equals(familySuites.getNameOfSuite())) {
								familySuites.setNumOfAdultAndChild();
							}
							hotelBookingDetails[i].getUserInput();
							hotelBookingDetails[i].displayBookingDetails();
						}
					}
				} else if (selectedService.equalsIgnoreCase("Cruise")) {
					System.out.println(
							"We offer 4 different packages as displayed below. Please enter the cruise that you want to select."
									+ "\n" + "Scenic Cruise" + "\n" + "Sunset Cruise" + "\n" + "Discovery Cruise" + "\n"
									+ "Mystery Cruise");
					String enteredNameOfcruise = sc.nextLine();
					for (int i = 0; i < cruiseBookingDetail.length; i++) {
						if (enteredNameOfcruise.equals(cruiseBookingDetail[i].getCruiseName())) {
							cruiseBookingDetail[i].getUserInputForBooking();
							cruiseBookingDetail[i].displayBookingDetails();
						}
					}
				} else {
					System.out.println("Enter the service from the two options");
				}
				invalidTryCount++;
				break;
			} while (invalidTryCount < 3);
			if (invalidTryCount > 2) {
				System.out.println("You have reached max try");
			} else {
				System.out.println(
						"Do you want to book another Hotel Room or Cruise. Press Y if you want otherwise any letter");
				optionForContinue = sc.nextLine();
				if (!optionForContinue.equalsIgnoreCase("y")) {
					System.out.println("Thank you.Have a nice day");
					System.exit(0);
				}
			}
		} while (optionForContinue.equalsIgnoreCase("y"));
	}
}
