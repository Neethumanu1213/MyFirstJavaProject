package assignmentWeek7;

import java.util.Scanner;

public class CruiseCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Cruise Booking.");
		System.out.println("Please sign up to book a cruise.");
		System.out.println("Enter your email address.");
		String userName = sc.nextLine();
		System.out.println("Enter the password that you want to use");
		String password = sc.nextLine();
		System.out.println("Enter your Full Name");
		String fullName = sc.nextLine();
		System.out.println("Enter your phone number"); 
		int phoneNumber = sc.nextInt();

		// Creating instance of UserDetails class and invoking the constructor with
		// parameters
		UserDetails userDetails = new UserDetails(userName, password, fullName, phoneNumber);

		// checking whether user can login using the username and password
		int invalidCredentlTry = 0;

		while (invalidCredentlTry < 3) {
			System.out.println("Enter the email ID to login");
			String loginUsername = sc.next();
			System.out.println("Enter password to login");
			String loginPassword = sc.next();
			// Consumes new line leftover
			sc.nextLine();

			// Validating the credentials

			if (!userDetails.validateCredentials(loginUsername, loginPassword)) {
				System.out.println("enter valid credentials");
			} else {
				System.out.println("You have successfully logged in");
				break;
			}
			invalidCredentlTry++;
		}
		if (invalidCredentlTry > 2) {
			System.out.println("You have reached your max attempt");
			System.exit(invalidCredentlTry);
		}

		// creating instance of class and invoking the constructor
		CruiseDetails scenicCruise = new CruiseDetails("Scenic Cruise", 3, 43.99, 12.99);
		CruiseDetails sunsetCruise = new CruiseDetails("Sunset Cruise", 1, 52.99, 13.99);
		CruiseDetails discoveryCruise = new CruiseDetails("Discovery Cruise", 4, 39.99, 9.99);
		CruiseDetails mysteryCruise = new CruiseDetails("Mystery Cruise", 2, 45.99, 12.99);

		// Array of objects
		CruiseDetails[] cruiceDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		// initializing the variable
		int countForInvalidEntry = 0;
		int flag = 0;
		int numOfAdult = 0;
		CruiseDetails selectedCruice = null;

		// while loop to iterate 3 times for user to change the options
		while (countForInvalidEntry < cruiceDetails.length) {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select."
							+ "\n" + "Scenic Cruise" + "\n" + "Sunset Cruise" + "\n" + "Discovery Cruise" + "\n"
							+ "Mystery Cruise");
			String enteredNameOfcruise = sc.nextLine();

			// iterating over object array to find the selected cruise
			for (int i = 0; i < cruiceDetails.length; i++) {

				if (enteredNameOfcruise.equals(cruiceDetails[i].cruiseName)) {
					cruiceDetails[i].printCruiseDetails();
					selectedCruice = cruiceDetails[i];
					flag = 1;
				}

			}

			// if the cruise is selected then continue booking
			if (flag != 0) {
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another");
				String cruiseSelection = sc.next();

				if (cruiseSelection.equalsIgnoreCase("Y")) {
					int adultAgeTry = 0;

					// do while to iterate for validating the condition adult>0 .
					do {
						System.out.println("Enter the number of adults");
						numOfAdult = sc.nextInt();
						selectedCruice.setNumberOfAdult(numOfAdult);
						if (numOfAdult > 0) {
							selectedCruice.setNumberOfChild();
							break;
						} else if (adultAgeTry == 2) {
							System.out.println("You have not enter valid input for number of adult ");
							System.exit(adultAgeTry);
						} else {
							System.out.println("The number of adult should be greater than zero");
						}
						adultAgeTry++;
					} while (adultAgeTry < 3);

					break;
				}
			} else {
				System.out.println("Enter valid cruise name");
			}
			countForInvalidEntry++;
		}

		// Condition for buffet option
		if ((selectedCruice != (null))) {

			System.out.println("All our cruises have food service on board. Press Y if you want "
					+ "to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
			String mealBooking = sc.next();
			selectedCruice.setMealBooking(mealBooking);

			selectedCruice.printBookingDetails();
		} else {
			System.out.println("You have enterd wrong cruise name");
		}

		// option to change credentials/personal info
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String changePersonalDetails = sc.next();
		if (changePersonalDetails.equalsIgnoreCase("Y")) {

			System.out.println("Please enter the information you want to change.\n" + "1. Password\n"
					+ "2. Phone number\n" + "3. Email");
			int optionSelected = sc.nextInt();

			int passwordTry = 0;
			while (passwordTry < 3) {

				// Validating the password
				System.out.println("Enter the existing  password");
				password = sc.next();
				if (userDetails.validatePassword(password)) {

					switch (optionSelected) {
					case 1:
						System.out.println("Enter the new password");
						String newPassword = sc.next();
						userDetails.setPassword(newPassword);

						break;

					case 2:
						System.out.println("Enter the new number");
						int newPhoneNumber = sc.nextInt();
						userDetails.setPhoneNumber(newPhoneNumber);
						break;

					case 3:
						System.out.println("Enter the new username");
						String newUserName = sc.next();
						userDetails.setUserName(newUserName);
						break;

					default:
						System.out.println("Enter valid options");
						break;
					}
					break;

				} else if (passwordTry == 2) {
					System.out.println("You have reached max limit");

					break;
				} else {
					System.out.println("Password is incorrect");

				}
				passwordTry++;
			}
		}
		System.out.println("Thank you for using the service!");
	}
}
