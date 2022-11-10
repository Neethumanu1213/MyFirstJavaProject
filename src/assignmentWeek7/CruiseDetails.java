package assignmentWeek7;

import java.util.Scanner;

public class CruiseDetails {
	String cruiseName;
	int daysOfTrip;
	double adultPrice;
	double childPrice;
	double adultMealPrice = 20.99;
	double childMealPrice = 4.99;
	int numOfChildrenAbove5;
	int numOfAdult;
	String mealBooking;
	double hstRate = 15;

	Scanner sc = new Scanner(System.in);

	public CruiseDetails(String nameOfCruise, int noOfDays, double priceForAdult, double priceForChild) {
		cruiseName = nameOfCruise;
		daysOfTrip = noOfDays;
		adultPrice = priceForAdult;
		childPrice = priceForChild;
	}

	void printCruiseDetails() {
		System.out
				.println("The cruise that you have selected is " + cruiseName + " is " + daysOfTrip + " days of trip");
		System.out.println("Price for Adults  (greater than 12)  : " + adultPrice + " per day");
		System.out.println("Price for kids above 5             : " + childPrice + " per day");
	}

	void setNumberOfAdult(int numOfAdult) {
		this.numOfAdult = numOfAdult;

	}

	double getAdultPriceForCruise(int numOfAdult) {
		double cruicePriceForAdult = (adultPrice * numOfAdult * daysOfTrip);
		return cruicePriceForAdult;
	}

	void setNumberOfChild() {

		System.out.println("Enter the number of Children");
		int numOfChildren = sc.nextInt();

		if (numOfChildren > 0) {
			for (int i = 1; i <= numOfChildren; i++) {
				System.out.println("Enter the age of child " + i);
				int ageOfChild = sc.nextInt();
				if ((ageOfChild > 5) && (ageOfChild < 12)) {
					numOfChildrenAbove5++;
				}

			}
		}

	}

	double getChildPriceForCruise(int ageOfChild) {
		double cruisePriceForChild = 0;
		cruisePriceForChild = childPrice * numOfChildrenAbove5 * daysOfTrip;
		return cruisePriceForChild;

	}

	void setMealBooking(String mealBooking) {
		this.mealBooking = mealBooking;
	}

	double getPriceForAdultMeal(int numOfAdult) {
		double mealPriceForAdult = 0;
		if (mealBooking.equalsIgnoreCase("Y")) {
			mealPriceForAdult = adultMealPrice * numOfAdult * daysOfTrip;
		}
		return mealPriceForAdult;
	}

	double getPriceForChildMeal(int numofChildrenAbove5) {
		double mealPriceForChild = 0;
		if (mealBooking.equalsIgnoreCase("Y")) {
			mealPriceForChild = childMealPrice * numofChildrenAbove5 * daysOfTrip;
		}
		return mealPriceForChild;
	}

	public double getTotalPrice(int numOfAdult) {
		double totalPrice = getAdultPriceForCruise(numOfAdult) + getChildPriceForCruise(numOfChildrenAbove5)
				+ getPriceForAdultMeal(numOfAdult) + getPriceForChildMeal(numOfChildrenAbove5);
		return totalPrice;
	}

	public double getHstPrice(int numOfAdult) {
		return ((getTotalPrice(numOfAdult) * hstRate) / 100);
	}

	public double getFinalPrice(int numOfAdult) {
		return getHstPrice(numOfAdult) + getTotalPrice(numOfAdult);
	}

	void printBookingDetails() {
		System.out.println("Your Package includes: ");
		System.out.println(
				cruiseName + " Adults  @  " + numOfAdult + "               : $" + getAdultPriceForCruise(numOfAdult));
		System.out.println(cruiseName + "Children above 5 @ " + numOfChildrenAbove5 + "        : $"
				+ getChildPriceForCruise(numOfChildrenAbove5));
		if(mealBooking.equals("Y")) {
		System.out.println(
				"Buffet Special Price Adults @" + numOfAdult + "           : $" + getPriceForAdultMeal(numOfAdult));
		System.out.println("Buffet Special Price Children above 5 @ " + numOfChildrenAbove5 + ": $"
				+ getPriceForChildMeal(numOfChildrenAbove5));
		}else {
			System.out.println("Meal is not selected");
		}
		System.out.println("Total Price                              : $" + getTotalPrice(numOfAdult));
		System.out.println("HST	@ " + hstRate + "                           : $" + getHstPrice(numOfAdult));
		System.out.println("Total                                    : $" + getFinalPrice(numOfAdult));
	}

}
