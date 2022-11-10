package assignmentWeek10;

import java.util.Scanner;

public class SunsetCruise extends CruiseBookingDetails {
	
	double additionalChargeForCandleDinner;
	double adultCandleDinnerPrice = 0;
	Scanner sc = new Scanner(System.in);

	public SunsetCruise(String cruiseName, int daysOfTrip, double adultPrice, double childPrice,
			double additionalCharges) {
		super(cruiseName, daysOfTrip, adultPrice, childPrice);
		this.additionalChargeForCandleDinner = additionalCharges;

	}

	public double getSpecialFeaturePrice() {
		System.out.println(
				"Sunset Cruise  have a candle light dinner for which the user will be charged$45/person.. Press Y if you want "
						+ "to pre-book for candle light dinner. ");
		String spaBooking = sc.next();
		if (spaBooking.equalsIgnoreCase("y")) {
			adultCandleDinnerPrice = additionalChargeForCandleDinner * numOfAdult;

		}
		return adultCandleDinnerPrice;
	}

}
