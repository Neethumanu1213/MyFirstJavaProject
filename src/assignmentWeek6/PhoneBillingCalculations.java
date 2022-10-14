//Write a Program which will help a user to select a cellphone from different models and
//different plans.calculate the total bill

package assignmentWeek6;

import java.util.Scanner;

public class PhoneBillingCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// creating instance of PhoneBillingMethods class
		PhoneBillingMethods phoneBillM = new PhoneBillingMethods();

		String typeOfPhone = "";
		for (int numOfAttempt = 1; numOfAttempt <= 3; numOfAttempt++) {

			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
			typeOfPhone = sc.next();
			if ((typeOfPhone.equals("Samsung")) || (typeOfPhone.equals("Apple"))) {
				phoneBillM.getPhoneBrand(typeOfPhone);
				break;
			} else if (numOfAttempt == 3) {
				System.out.println("Invalid Phone Brand");
				System.exit(numOfAttempt);
			}
		}

		int priceOfPhoneModel = 0;
		String modelOfPhone = "";
		for (int numOfAttempt = 1; numOfAttempt <= 3; numOfAttempt++) {
			modelOfPhone = sc.next();
			priceOfPhoneModel = phoneBillM.getPhonePriceByModel(modelOfPhone);

			if (priceOfPhoneModel > 0) {
				break;
			} else if (numOfAttempt == 3) {
				System.out.println("Invalid Phone Model");
				System.exit(numOfAttempt);
			} else {
				System.out.println("Enter valid phone model from the above list");
			}

		}
		int priceOfPhonePlan = 0;
		String phonePlan = "";
		for (int numOfAttempt = 1; numOfAttempt <= 3; numOfAttempt++) {
			System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
			phonePlan = sc.next();
			priceOfPhonePlan = phoneBillM.getPhonePriceByPlan(phonePlan);
			if (priceOfPhonePlan > 0) {
				break;
			} else if (numOfAttempt == 3) {
				System.out.println("Enter valid phone plan");
				System.exit(numOfAttempt);
			}
		}
		// final bill for phone and plan added and assigned in local variable
		int finalPhoneBill = priceOfPhoneModel + priceOfPhonePlan;

		System.out.println("You have selected " + modelOfPhone + " with " + phonePlan + " plan");
		System.out.println("Your phone tab will be : $" + priceOfPhoneModel);
		System.out.println("Your monthly plan will be : $" + priceOfPhonePlan);
		System.out.println("Your Monthly amount : $" + finalPhoneBill);
	}

}
