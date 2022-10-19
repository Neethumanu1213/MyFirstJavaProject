package assignmentWeek7;

import java.util.Scanner;

public class CruiceCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// creating instance of class and invoking the constructor
		CruiceDetails scenicCruise = new CruiceDetails("Scenic Cruise", 3, 43.99, 12.99);
		CruiceDetails sunsetCruise = new CruiceDetails("Sunset Cruise", 1, 52.99, 13.99);
		CruiceDetails discoveryCruise = new CruiceDetails("Discovery Cruise", 4, 39.99, 9.99);
		CruiceDetails mysteryCruise = new CruiceDetails("Mystery Cruise", 2, 45.99, 12.99);

		// Array of objects
		CruiceDetails[] cruiceDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		// initializing the variable
		int countForInvalidEntry = 0;
		int flag = 0;
		int numOfAdult = 0;
		int numOfChildren = 0;
		double totalAdultPrice = 0;
		int numOfChildrenAbove5 = 0;
		double totalChildPrice = 0;
		CruiceDetails selectedCruice = null;

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
				String cruiseSelection = sc.nextLine();

				if (cruiseSelection.equals("Y")) {
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
									if (ageOfChild > 5) {
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

	}

}
