package assignmentWeek6;

public class PhoneBillingMethods {

	// Method to select the type of phone
	void phoneType(String typeOfPhone) {

		if (typeOfPhone.equals("Samsung")) {
			System.out.println("Please enter the model of phone you want to buy from below");
			System.out.println("S22");
			System.out.println("S22+");
			System.out.println("S22_Ultra");
			System.out.println("S22FE");
		} else if (typeOfPhone.equals("Apple")) {
			System.out.println("Please enter the model of phone you want to buy from below");
			System.out.println("IPhone_14");
			System.out.println("IPhone_14_pro");
			System.out.println("IPhone_14_pro_max");
			System.out.println("IPhone_14_mini");

		} else {
			System.out.println("Enter valid phone type");
		}
	}

	// Method to get the price of each model
	int phoneBrand(String modelOfPhone) {

		int billPerMonth = 0;
		switch (modelOfPhone) {
		case "S22":
			billPerMonth = 25;
			break;
		case "S22+":
			billPerMonth = 35;
			break;
		case "S22_Ultra":
			billPerMonth = 55;
			break;
		case "S22FE":
			billPerMonth = 20;
			break;
		case "IPhone_14":
			billPerMonth = 30;

			break;
		case "IPhone_14_pro":
			billPerMonth = 40;
			break;
		case "IPhone_14_pro_max":
			billPerMonth = 65;
			break;
		case "IPhone_14_mini":
			billPerMonth = 25;
			break;
		default:
			System.out.println("Invalid Model");
			break;
		}
		return billPerMonth;
	}

	// Method to select the phone plans
	int phonePlanType(String phonePlan) {
		int planPrice = 0;

		if (phonePlan.equals("Roger")) {
			planPrice = 70;
		} else if (phonePlan.equals("Bell")) {
			planPrice = 80;
		} else if (phonePlan.equals("Telus")) {
			planPrice = 75;
		} else {
			planPrice = 0;
			System.out.println("Choose one from Roger,Bell or Telus");
		}

		return planPrice;
	}
}