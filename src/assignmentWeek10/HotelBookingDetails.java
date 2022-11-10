package assignmentWeek10;

import java.util.Scanner;

public class HotelBookingDetails extends UserDetails {

	private String nameOfSuite;
	double roomRentPerDy;
	private double adultmealPriceInHotel = 25;
	private double childMealPriceInHotel = 5;
	private double taxRate = 18;
	private String mealBooking = "";
	double mealPriceForAdult = 0;
	double mealPriceForChild = 0;
	double totalPrice = 0;

	Scanner sc = new Scanner(System.in);

	public HotelBookingDetails(String nameOfSuite, double roomRentPerDay) {
		super();
		this.nameOfSuite = nameOfSuite;
		this.roomRentPerDy = roomRentPerDay;
	}

	public void setMealBookingInHotel() {
		System.out.println(
				"All rooms come with free breakfast.Press Y if  you want to add lunch in your room as well at a discounted "
						+ "pre-booking rate of $25/ adult and $5/ child or press any letter to coninue.");
		String mealBooking = sc.next();
		if (mealBooking.equalsIgnoreCase("y")) {
			this.mealBooking = mealBooking;
		}
	}

	private double getPriceForAdultMeal(int noOfAdults, int noOfDays) {
		mealPriceForAdult = 0;

		mealPriceForAdult = adultmealPriceInHotel * noOfAdults * noOfDays;

		return mealPriceForAdult;
	}

	private double getPriceForChildMeal(int noOfChild, int noOfDays) {
		mealPriceForChild = 0;

		mealPriceForChild = childMealPriceInHotel * noOfChild * noOfDays;

		return mealPriceForChild;
	}

	protected double getTotalPrice(double totalPriceforStay) {
		return totalPrice = totalPriceforStay + mealPriceForAdult + mealPriceForChild;

	}

	private double getTaxPrice() {
		return ((totalPrice * taxRate) / 100);
	}

	private double getFinalPriceWithTax() {
		return getTaxPrice() + totalPrice;
	}

	public void displayBookingDetails(double totalPriceforStay, int noOfAdults, int noOfDays, int noOfChild) {
		System.out.println("The total amount you will be charged is :");
		System.out.println(nameOfSuite + " @ " + noOfDays + " nights                    :" + totalPriceforStay);
		if (mealBooking.equalsIgnoreCase("y")) {
			System.out.println("Lunch Pre-Booked Special Rate Adults @ " + noOfAdults + "    :$"
					+ getPriceForAdultMeal(noOfAdults, noOfDays));
			System.out.println("Lunch Pre-Booked Special Rate children @ " + noOfChild + "  :$"
					+ getPriceForChildMeal(noOfChild, noOfDays));
		} else {
			System.out.println("Meal is not selected");
		}
		System.out.println("Total Price                                 :$" + getTotalPrice(totalPriceforStay));
		System.out.println("HST @" + taxRate + "                                   :$" + getTaxPrice());
		System.out.println("Final price                                 :$" + getFinalPriceWithTax());
	}
}
