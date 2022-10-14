package assignmentWeek6;

public class PhoneBillingMethods {

	// Method to select the type of phone
	void getPhoneBrand(String typeOfPhone) {

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
	int getPhonePriceByModel(String modelOfPhone) {

		int calculatedTab = 0;
		switch (modelOfPhone) {
		case "S22":
			calculatedTab = 25;
			break;
		case "S22+":
			calculatedTab = 35;
			break;
		case "S22_Ultra":
			calculatedTab = 55;
			break;
		case "S22FE":
			calculatedTab = 20;
			break;
		case "IPhone_14":
			calculatedTab = 30;

			break;
		case "IPhone_14_pro":
			calculatedTab = 40;
			break;
		case "IPhone_14_pro_max":
			calculatedTab = 65;
			break;
		case "IPhone_14_mini":
			calculatedTab = 25;
			break;
		default:
			calculatedTab = 0;
			break;
		}
		return calculatedTab;
	}

	// Method to select the phone plans
	int getPhonePriceByPlan(String phonePlan) {
		int planPrice = 0;

		if (phonePlan.equals("Rogers")) {
			planPrice = 70;
		} else if (phonePlan.equals("Bell")) {
			planPrice = 80;
		} else if (phonePlan.equals("Telus")) {
			planPrice = 75;
		} else {
			planPrice = 0;

		}

		return planPrice;
	}
}