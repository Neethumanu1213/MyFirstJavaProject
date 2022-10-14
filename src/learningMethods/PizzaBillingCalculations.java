package learningMethods;

import java.util.Scanner;

public class PizzaBillingCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the size of pizza from SMALL,MEDIUM,LARGE");
		String sizeOfPizza = sc.next();

		PizzaBillingMethods pizzaBillM = new PizzaBillingMethods();
		int priceOfPizza = pizzaBillM.pizzaPrice(sizeOfPizza);

		System.out.println("Do you need extra cheese Y/N");
		String cheeseAdded = sc.next();
		int priceOfExtraCheese = pizzaBillM.cheesePrice(cheeseAdded);

		int totalPrice = priceOfPizza + priceOfExtraCheese;

		System.out.println("Prize of pizza :" + totalPrice);

	}

}
