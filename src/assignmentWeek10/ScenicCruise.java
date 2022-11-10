package assignmentWeek10;

import java.util.Scanner;

public class ScenicCruise extends CruiseBookingDetails {

	double additionalChargeForSpa;
	double adultSpaPrice = 0;
	Scanner sc = new Scanner(System.in);

	public ScenicCruise(String cruiseName, int daysOfTrip, double adultPrice, double childPrice,
			double additionalCharges) {
		super(cruiseName, daysOfTrip, adultPrice, childPrice);
		this.additionalChargeForSpa = additionalCharges;
	}

	public double getSpecialFeaturePrice() {
		System.out.println(
				"Scenic Cruise  have a Spa for which the user will be charged $50 per person.. Press Y if you want "
						+ "to pre-book for spa service  at 50  for adults ");
		String spaBooking = sc.next();
		if (spaBooking.equalsIgnoreCase("y")) {
			adultSpaPrice = additionalChargeForSpa * numOfAdult;

		}
		return adultSpaPrice;
	}

}
