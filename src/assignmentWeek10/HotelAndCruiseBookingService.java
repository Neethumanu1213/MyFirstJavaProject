package assignmentWeek10;

import java.util.Scanner;

public class HotelAndCruiseBookingService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		UserDetails userDetails = new UserDetails();

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
					switch (enteredNameOfSuite) {
					case "Delux Suites":
			 			DeluxSuites deluxSuites = new DeluxSuites("Delux Suites", 180);
						deluxSuites.setNumOfAdultAndChild();
						deluxSuites.setNoOfDays();
						deluxSuites.setMealBookingInHotel();
						int adultNumOfDelux = deluxSuites.getNoOfAdult();
						int childNumOfDelux = deluxSuites.getNoOfChild();
						int noOfDaysForDelux = deluxSuites.getNoOfDays();
						double priceForStayDelux = deluxSuites.getTotalPriceForStay();
						deluxSuites.displayBookingDetails(priceForStayDelux, adultNumOfDelux, noOfDaysForDelux,
								childNumOfDelux);
						break;
					case "Family Suites":
						FamilySuites familySuites = new FamilySuites("Family Suites", 230);
						familySuites.setNumOfAdultAndChild();
						familySuites.setNoOfDays();
						familySuites.setMealBookingInHotel();
						int adultNumOfFamily = familySuites.getNoOfAdult();
						int childNumOfFamily = familySuites.getNoOfChild();
						int noOFDaysForFamily = familySuites.getNoOfDays();
						double priceForStayFamily = familySuites.getTotalPriceForStay();
						familySuites.displayBookingDetails(priceForStayFamily, adultNumOfFamily, noOFDaysForFamily,
								childNumOfFamily);

						break;

					default:
						System.out.println("Enter valid option");
						;
					}
					break;

				} else if (selectedService.equalsIgnoreCase("Cruise")) {
					System.out.println(
							"We offer 4 different packages as displayed below. Please enter the cruise that you want to select."
									+ "\n" + "Scenic Cruise" + "\n" + "Sunset Cruise" + "\n" + "Discovery Cruise" + "\n"
									+ "Mystery Cruise");
					String enteredNameOfcruise = sc.nextLine();

					switch (enteredNameOfcruise) {
					case "Scenic Cruise":
						ScenicCruise scenicCruise = new ScenicCruise("Scenic Cruise", 3, 43.99, 12.99, 50);
						scenicCruise.printCruiseDetails();
						scenicCruise.getUserInputForBooking();
						double priceForSpa = scenicCruise.getSpecialFeaturePrice();
						scenicCruise.displayBookingDetails(priceForSpa);
						break;
					case "Sunset Cruise":
						SunsetCruise sunsetCruise = new SunsetCruise("Sunset Cruise", 1, 52.99, 13.99, 45);
						sunsetCruise.printCruiseDetails();
						sunsetCruise.getUserInputForBooking();
						double priceForCandleLight = sunsetCruise.getSpecialFeaturePrice();
						sunsetCruise.displayBookingDetails(priceForCandleLight);
						break;
					case "Discovery Cruise":
						DiscoveryCruise discoveryCruise = new DiscoveryCruise("Discovery Cruise", 4, 39.99, 9.99, 50);
						discoveryCruise.printCruiseDetails();
						discoveryCruise.getUserInputForBooking();
						double priceForgame = discoveryCruise.getSpecialFeaturePrice();
						discoveryCruise.displayBookingDetails(priceForgame);
						break;
					case "Mystery Cruise":
						MysteryCruise mysteryCruise = new MysteryCruise("Mystery Cruise", 2, 45.99, 12.99, 20);
						mysteryCruise.printCruiseDetails();
						mysteryCruise.getUserInputForBooking();
						double priceForCasino = mysteryCruise.getSpecialFeaturePrice();
						mysteryCruise.displayBookingDetails(priceForCasino);
						break;
					default:
						System.out.println("Enter valid cruise name");
						break;
					}
					break;

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
