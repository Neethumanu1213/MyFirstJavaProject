package week10Assignment;

public class FamilySuites extends HotelBookingDetails {
	private int noOfAdult;
	private int noOfChild;

	public FamilySuites(String nameOfSuite, double roomRentPerDay) {
		super(nameOfSuite, roomRentPerDay);
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
			if (noOfAdult > 4 || noOfChild > 4) {
				System.out.println(
						"The room is not suitable for the number of guests please select again or select separate rooms one at a time.");
				isValidPeopleNum = false;
			} else {
				super.noOfAdult = noOfAdult;
				super.noOfChild = noOfChild;
			}
		} while (!isValidPeopleNum);
	}
}
