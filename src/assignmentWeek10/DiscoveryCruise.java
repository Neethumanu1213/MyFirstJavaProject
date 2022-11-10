package assignmentWeek10;

import java.util.Scanner;

public class DiscoveryCruise extends CruiseBookingDetails {
	
	double additionalChargeForAdvenGames;
	double adultAdventureGamePrice = 0;
	Scanner sc = new Scanner(System.in);

	public DiscoveryCruise(String cruiseName, int daysOfTrip, double adultPrice, double childPrice,
			double additionalCharges) {
		super(cruiseName, daysOfTrip, adultPrice, childPrice);

	}

	public double getSpecialFeaturePrice() {
		System.out.println(
				"Discovery Cruise will have Adventure Games which has an entry fee of $$50/ person.. Press Y if you want "
						+ "to pre-book for adventure games.  ");
		String spaBooking = sc.next();
		if (spaBooking.equalsIgnoreCase("y")) {
			adultAdventureGamePrice = additionalChargeForAdvenGames * numOfAdult;

		}
		return adultAdventureGamePrice;
	}

}
