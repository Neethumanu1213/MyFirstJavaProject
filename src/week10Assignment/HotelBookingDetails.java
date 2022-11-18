package week10Assignment;

public class HotelBookingDetails extends UserDetails {
	private String nameOfSuite;
	private double roomRentPerDay;
	private double adultmealPriceInHotel = 25;
	private double childMealPriceInHotel = 5;
	private double taxRate = 18;
	private String mealBooking = "";
	private double mealPriceForAdult = 0;
	private double mealPriceForChild = 0;
	private double totalPrice = 0;
	private int noOfDays;
	protected int noOfAdult;
	protected int noOfChild;

	public HotelBookingDetails(String nameOfSuite, double roomRentPerDay) {
		super();
		this.nameOfSuite = nameOfSuite;
		this.roomRentPerDay = roomRentPerDay;
	}

	public String getNameOfSuite() {
		return nameOfSuite;
	}

	private void setMealBookingInHotel() {
		System.out.println(
				"All rooms come with free breakfast.Press Y if  you want to add lunch in your room as well at a discounted "
						+ "pre-booking rate of $25/ adult and $5/ child or press any letter to coninue.");
		String mealBooking = sc.next();
		if (mealBooking.equalsIgnoreCase("y")) {
			this.mealBooking = mealBooking;
		}
	}

	private void setNoOfDays() {
		System.out.println("Enter the number of days of stay");
		this.noOfDays = sc.nextInt();
	}

	public void getUserInput() {
		setNoOfDays();
		setMealBookingInHotel();
	}

	private double getPriceForAdultMeal() {
		return mealPriceForAdult = adultmealPriceInHotel * noOfAdult * noOfDays;
	}

	private double getPriceForChildMeal() {
		return mealPriceForChild = childMealPriceInHotel * noOfChild * noOfDays;
	}

	private double getTotalPriceForStay() {
		return roomRentPerDay * noOfDays;
	}

	private double getTotalPrice() {
		return totalPrice = getTotalPriceForStay() + mealPriceForAdult + mealPriceForChild;
	}

	private double getTaxPrice() {
		return ((totalPrice * taxRate) / 100);
	}

	private double getFinalPriceWithTax() {
		return getTaxPrice() + totalPrice;
	}

	public void displayBookingDetails() {
		System.out.println("The total amount you will be charged is :");
		System.out.println(nameOfSuite + " @ " + noOfDays + " nights                     :" + getTotalPriceForStay());
		if (mealBooking.equalsIgnoreCase("y")) {
			System.out
					.println("Lunch Pre-Booked Special Rate Adults @ " + noOfAdult + "    :$" + getPriceForAdultMeal());
			System.out
					.println("Lunch Pre-Booked Special Rate children @ " + noOfChild + "  :$" + getPriceForChildMeal());
		} else {
			System.out.println("Meal is not selected");
		}
		System.out.println("Total Price                                 :$" + getTotalPrice());
		System.out.println("HST @" + taxRate + "                                   :$" + getTaxPrice());
		System.out.println("Final price                                 :$" + getFinalPriceWithTax());
	}
}
