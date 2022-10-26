package assignmentWeek7;

public class CruiseDetails {
	String cruiseName;
	int daysOfTrip;
	double adultPrice;
	double childPrice;
	double adultMealPrice = 20.99;
	double childMealPrice = 4.99;

	public CruiseDetails(String nameOfCruise, int noOfDays, double priceForAdult, double priceForChild) {
		cruiseName = nameOfCruise;
		daysOfTrip = noOfDays;
		adultPrice = priceForAdult;
		childPrice = priceForChild;
	}

	

	double getAdultPriceForCruice(int numofAdult) {
		double cruicePriceForAdult = (adultPrice * numofAdult * daysOfTrip);
		return cruicePriceForAdult;
	}

	double getchildPriceForCruice(int numOfChildrenAbove5) {
		double cruisePriceForChild = 0;
		cruisePriceForChild = childPrice * numOfChildrenAbove5 * daysOfTrip;
		return cruisePriceForChild;
	}

	double getPriceForAdultMeal(String mealBooking, int numofAdult) {
		double mealPriceForAdult = 0;
		if (mealBooking.equalsIgnoreCase("Y")) {
			mealPriceForAdult = adultMealPrice * numofAdult * daysOfTrip;
		}else {
			System.out.println("Meal is not selected");
		}
		return mealPriceForAdult;
	}

	double getPriceForChildMeal(String mealBooking, int numofChildrenAbove5) {
		double mealPriceForChild = 0;
		if (mealBooking.equalsIgnoreCase("Y")) {
			mealPriceForChild = childMealPrice * numofChildrenAbove5 * daysOfTrip;
		}
		return mealPriceForChild;
	}
}