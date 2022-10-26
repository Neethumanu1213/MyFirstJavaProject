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
		String existingPassword = sc.nextLine();
		System.out.println("Enter your Full Name");
		String fullName = sc.nextLine();
		System.out.println("Enter your phone number");
		int phoneNumber = sc.nextInt();

		//Creating instance of UserDetails class and invoking the constuctor with parameters
		UserDetails userDetails = new UserDetails(userName, existingPassword, fullName, phoneNumber);

		// check whether they can login using the username and password
		int validCredTry = 0;

		while (validCredTry < 3) {
			System.out.println("Enter the email ID to login");
			String loginUsername = sc.next();
			System.out.println("Enter password to login");
			String loginPassword = sc.next();
			boolean validateCredential = userDetails.validateCredentials(loginUsername, loginPassword);

			if (!validateCredential) {
				System.out.println("enter valid credentials");
			} else {
				System.out.println("You have successfully logged in");
				break;
			}
			validCredTry++;
		}
		if (validCredTry > 2) {
			System.out.println("You have reached your max attempt");
			System.exit(validCredTry);
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
		int numOfChildren = 0;
		double totalAdultPrice = 0;
		int numOfChildrenAbove5 = 0;
		double totalChildPrice = 0;
		CruiseDetails selectedCruice = null;

		// while loop to iterate 3 times for user to change the options
		while (countForInvalidEntry < cruiceDetails.length) {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select."
							+ "\n" + "Scenic Cruise" + "\n" + "Sunset Cruise" + "\n" + "Discovery Cruise" + "\n"
							+ "Mystery Cruise");
			//sc.nextLine();
			String enteredNameOfcruise = sc.nextLine();
System.out.println("Entered cruise name is  "+enteredNameOfcruise);

			// iterating over object array to find the selected cruise
			for (int i = 0; i < cruiceDetails.length; i++) {

				if (enteredNameOfcruise.equals(cruiceDetails[i].cruiseName)) {
					System.out.println("The cruise that you have selected is " + enteredNameOfcruise + " is "
							+ cruiceDetails[i].daysOfTrip + " days of trip");
					System.out.println(
							"Price for Adults	(greater than 12)  : " + cruiceDetails[i].adultPrice + " per day");
					System.out.println(
							"Price for kids above 5			   : " + cruiceDetails[i].childPrice + " per day");
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

						if (numOfAdult > 0) {
							totalAdultPrice = selectedCruice.getAdultPriceForCruice(numOfAdult);

							System.out.println("Enter the number of Children");
							numOfChildren = sc.nextInt();

							if (numOfChildren > 0) {
								for (int i = 1; i <= numOfChildren; i++) {
									System.out.println("Enter the age of child " + i);
									int ageOfChild = sc.nextInt();
									if ((ageOfChild > 5) && (ageOfChild < 12)) {
										numOfChildrenAbove5++;
									}
									totalChildPrice = selectedCruice.getchildPriceForCruice(numOfChildrenAbove5);
								}
							}
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

			double totalAdultMealPrice = selectedCruice.getPriceForAdultMeal(mealBooking, numOfAdult);
			double totalChildMealPrice = selectedCruice.getPriceForChildMeal(mealBooking, numOfChildrenAbove5);

			double totalPrice = totalAdultPrice + totalChildPrice + totalAdultMealPrice + totalChildMealPrice;

			double hstRate = 15;
			double totalHstCalculated = (totalPrice * hstRate) / 100;
			double totalPriceWithHst = totalPrice + totalHstCalculated;
			System.out.println("Your Package includes: ");
			System.out.println(
					selectedCruice.cruiseName + " Adults  @  " + numOfAdult + "               : $" + totalAdultPrice);
			System.out.println(selectedCruice.cruiseName + "Children above 5 @ " + numOfChildrenAbove5 + "        : $"
					+ totalChildPrice);
			System.out.println("Buffet Special Price Adults @" + numOfAdult + "           : $" + totalAdultMealPrice);
			System.out.println(
					"Buffet Special Price Children above 5 @ " + numOfChildrenAbove5 + ": $" + totalChildMealPrice);
			System.out.println("Total Price                              : $" + totalPrice);
			System.out.println("HST	@ " + hstRate + "                           : $" + totalHstCalculated);
			System.out.println("Total                                    : $" + totalPriceWithHst);
		} else {
			System.out.println("You have enterd wrong cruise name");
		}

		// option to change thier credentials
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String changePersonalDetails = sc.next();
		if (changePersonalDetails.equalsIgnoreCase("Y")) {

			System.out.println("Please enter the information you want to change.\n" + "1. Password\n"
					+ "2. Phone number\n" + "3. Email");
			int optionSelected = sc.nextInt();

			int passwordTry = 0;
			while (passwordTry < 3) {

				System.out.println("Enter the existing  password");
				existingPassword = sc.next();
				if (userDetails.validatePassword(existingPassword)) {

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
