package assignmentWeek7;

public class CruiceDetails {
	String cruiseName;
	int daysOfTrip;
	boolean isMealsOrdered;

	public CruiceDetails(String nameOfCruise, int noOfDays) {
		cruiseName = nameOfCruise;
		daysOfTrip = noOfDays;
	}

	void getCruiceDetais(String enteredNameOfcruice) {
		switch (enteredNameOfcruice) {
		case "Scenic Cruise":
			System.out.println(
					"The cruise that you have selected is Scenic Cruise which is " + daysOfTrip + "days of trip");
			System.out.println("Price for Adults	(greater than 12)	: 49.99 per day");
			System.out.println("Price for kids above 5			: 12.99 per day");
			break;
		case "Sunset Cruise":
			System.out.println(
					"The cruise that you have selected is Sunset Cruise which is " + daysOfTrip + "days of trip");
			System.out.println("Price for Adults	(greater than 12)	: 53.99 per day");
			System.out.println("Price for kids above 5			: 15.99 per day");
			break;
		case "Discovery Cruise":
			System.out.println(
					"The cruise that you have selected is Discovery Cruise which is " + daysOfTrip + "days of trip");
			System.out.println("Price for Adults	(greater than 12)	: 39.99 per day");
			System.out.println("Price for kids above 5			: 9.99 per day");
			break;
		case "Mystery Cruise":
			System.out.println(
					"The cruise that you have selected is Mystery Cruise which is " + daysOfTrip + "days of trip");
			System.out.println("Price for Adults	(greater than 12)	: 45.99 per day");
			System.out.println("Price for kids above 5			: 12.99 per day");
			break;
			
        default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
