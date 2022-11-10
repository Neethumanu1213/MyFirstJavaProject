package assignmentWeek10;

import java.util.Scanner;

public class DeluxSuites extends HotelBookingDetails {

	double roomRentPerDay;
	int noOfDays;
	int noOfAdult;
	int noOfChild;
	double totalPriceforStay;
	Scanner sc = new Scanner(System.in);

	public DeluxSuites(String nameOfSuite, double roomRentPerDay) {
		super(nameOfSuite, roomRentPerDay);
		this.roomRentPerDay = roomRentPerDay;
	}

	public void setNumOfAdultAndChild() {
		boolean isValidPeopleNum = false;
		do {
			System.out.println("Enter the number of Adult");
			noOfAdult = sc.nextInt();

			if (noOfAdult > 0) {

				System.out.println("Enter number of children");
				noOfChild = sc.nextInt();

			} else {
				System.out.println("Number of adult should be greater than zero");
				continue;
			}
			isValidPeopleNum = true;

			if (noOfAdult > 2 || noOfChild > 2) {
				System.out.println(
						"The room is not suitable for the number of guests please select again or select separate rooms one at a time.");
				isValidPeopleNum = false;
			}
		} while (!isValidPeopleNum);

	}

	public void setNoOfDays() {
		System.out.println("Enter the number of days of stay");
		this.noOfDays = sc.nextInt();

	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public int getNoOfAdult() {
		return noOfAdult;
	}

	public int getNoOfChild() {
		return noOfChild;
	}

	public double getTotalPriceForStay() {
		totalPriceforStay = roomRentPerDay * noOfDays;

		return totalPriceforStay;

	}

}
