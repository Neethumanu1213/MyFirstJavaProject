package learningMethods;

public class PizzaBillingMethods {
	int pizzaPrice(String sizeOfPizza) {
		int priceOfPizza = 0;
		switch (sizeOfPizza) {
		case "SMALL":
			priceOfPizza = 15;
			break;
		case "MEDIUM":
			priceOfPizza = 20;
			break;
		case "LARGE":
			priceOfPizza = 25;
			break;
		default:
			System.out.println("Enter valid pizza size");
			break;
		}
		return priceOfPizza;
	}

	int cheesePrice(String cheeseAdded) {
		int priceOfCheese = 0;
		if (cheeseAdded.equals("Y")) {
			priceOfCheese = 1;
		}else {
			priceOfCheese=0;
		}
		return priceOfCheese;
	}
}
