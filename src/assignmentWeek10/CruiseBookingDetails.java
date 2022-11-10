package assignmentWeek10;

import java.util.Scanner;

public class CruiseBookingDetails extends UserDetails { 

	private String cruiseName;
	private int daysOfTrip;
	private double adultPrice;
	private double childPrice;
	private double adultMealPrice = 20.99;
	private double childMealPrice = 4.99;
	private int numOfChildrenAbove5;
	protected int numOfAdult;
	private String mealBooking = "";
	private double hstRate = 15;
	Scanner sc = new Scanner(System.in);

	public CruiseBookingDetails(String cruiseName, int daysOfTrip, double adultPrice, double childPrice) {
		super();
		this.cruiseName = cruiseName;
		this.daysOfTrip = daysOfTrip;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
	}

	public void printCruiseDetails() {
		System.out
				.println("The cruise that you have selected is " + cruiseName + " is " + daysOfTrip + " days of trip");
		System.out.println("Price for Adults  (greater than 12)  : " + adultPrice + " per day");
		System.out.println("Price for kids above 5             : " + childPrice + " per day");
	}

	private void setNumberOfAdult() {

		int adultAgeTry = 0;
		do {
			System.out.println("Enter the number of adults");
			numOfAdult = sc.nextInt();

			if (numOfAdult > 0) {
				setNumberOfChild();
				break;
			} else if (adultAgeTry == 2) {
				System.out.println("You have not enter valid input for number of adult ");
				System.exit(adultAgeTry);
			} else {
				System.out.println("The number of adult should be greater than zero");
			}
			adultAgeTry++;
		} while (adultAgeTry < 3);
	}

	private void setNumberOfChild() {

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

	private double getAdultPriceForCruise() {
		double cruicePriceForAdult = (adultPrice * numOfAdult * daysOfTrip);
		return cruicePriceForAdult;
	}

	private double getChildPriceForCruise() {
		double cruisePriceForChild = 0;
		cruisePriceForChild = childPrice * numOfChildrenAbove5 * daysOfTrip;
		return cruisePriceForChild;

	}

	public void getUserInputForBooking() {
		setNumberOfAdult();
		setMealBooking();

	}

	private void setMealBooking() {
		System.out.println("All our cruises have food service on board. Press Y if you want "
				+ "to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
		String mealBooking = sc.next();
		if (mealBooking.equalsIgnoreCase("y")) {
			this.mealBooking = mealBooking;
		} else {
			System.out.println("Meal is not selected");
		}
	}

	private double getPriceForAdultMeal() {
		double mealPriceForAdult = 0;

		mealPriceForAdult = adultMealPrice * numOfAdult * daysOfTrip;

		return mealPriceForAdult;
	}

	private double getPriceForChildMeal() {
		double mealPriceForChild = 0;

		mealPriceForChild = childMealPrice * numOfChildrenAbove5 * daysOfTrip;

		return mealPriceForChild;
	}

	private double getTotalPrice(double additionalPrice) {
		double totalPrice = getAdultPriceForCruise() + getChildPriceForCruise() + getPriceForAdultMeal()
				+ getPriceForChildMeal() + additionalPrice;
		return totalPrice;
	}

	private double getHstPrice(double additionalPrice) {
		return ((getTotalPrice(additionalPrice) * hstRate) / 100);
	}

	private double getFinalPrice(double additionalPrice) {
		return getHstPrice(additionalPrice) + getTotalPrice(additionalPrice);
	}

	public void displayBookingDetails(double additionalPrice) {
		System.out.println("Your Package includes: ");
		System.out.println(cruiseName + " Adults  @  " + numOfAdult + "               : $" + getAdultPriceForCruise());
		System.out.println(
				cruiseName + "Children above 5 @ " + numOfChildrenAbove5 + "        : $" + getChildPriceForCruise());
		if (mealBooking.equalsIgnoreCase("Y")) {
			System.out
					.println("Buffet Special Price Adults @" + numOfAdult + "           : $" + getPriceForAdultMeal());
			System.out.println(
					"Buffet Special Price Children above 5 @ " + numOfChildrenAbove5 + ": $" + getPriceForChildMeal());
		} else {
			System.out.println("Meal is not selected");
		}
		if (additionalPrice > 0) {
			System.out.println("Additional service Price Adults @" + numOfAdult + "       : $" + additionalPrice);
		} else {
			System.out.println("Additional service is not selected");
		}
		System.out.println("Total Price                              : $" + getTotalPrice(additionalPrice));
		System.out.println("HST	@ " + hstRate + "                           : $" + getHstPrice(additionalPrice));
		System.out.println("Total                                    : $" + getFinalPrice(additionalPrice));

	}

}
