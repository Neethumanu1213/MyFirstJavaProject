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

		// Taking input from the console for type of phone
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String typeOfPhone = sc.next();

		if (typeOfPhone.equals("Samsung") || typeOfPhone.equals("Apple")) {
			// Invoking the phoneType method with reference variable
			phoneBillM.phoneType(typeOfPhone);

			// taking input for phone model
			String modelOfPhone = sc.next();

			// Invoking the phoneBrand method with reference variable and assigned in a
			// variable
			int phoneModelBill = phoneBillM.phoneBrand(modelOfPhone);

			if (phoneModelBill > 0) {

				// Taking input to select the plan
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String phonePlan = sc.next();

				// Invoking the phonePlanType method with reference variable assigned in a
				// variable
				int phonePlanBill = phoneBillM.phonePlanType(phonePlan);

				// final bill for phone and plan added and assigned in local variable
				int finalPhoneBill = phoneModelBill + phonePlanBill;

				System.out.println("You have selected " + modelOfPhone + " with " + phonePlan + "plan");
				System.out.println("Your phone tab will be : $" + phoneBillM.phoneBrand(modelOfPhone));
				System.out.println("Your monthly plan will be : $" + phonePlanBill);
				System.out.println("Your Monthly amount : $" + finalPhoneBill);
			} else {
				System.out.println("Please enter valid phone model");
			}
		} else {
			System.out.println("Invalid phonetype choose either Apple or Samsung");
		}
	}
}
