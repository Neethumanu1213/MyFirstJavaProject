package assignmentWeek10;

import java.util.Scanner;

public class MysteryCruise extends CruiseBookingDetails {
	
	double additionalChargeForCasino;
	double adultCasinoPrice = 0;
	Scanner sc = new Scanner(System.in);

	public MysteryCruise(String cruiseName, int daysOfTrip, double adultPrice, double childPrice,
			double additionalCharges) {
		super(cruiseName, daysOfTrip, adultPrice, childPrice);
		this.additionalChargeForCasino = additionalCharges;

	}

	public double getSpecialFeaturePrice() {
		System.out.println("Mystery Cruise  have a casino which has an entry fee of $$20/ person.. Press Y if you want "
				+ "to pre-book for casino.");
		String spaBooking = sc.next();
		if (spaBooking.equalsIgnoreCase("y")) {
			adultCasinoPrice = additionalChargeForCasino * numOfAdult;

		}
		return adultCasinoPrice;
	}

}
