

public class PizzaBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to prepare the bill for a pizza shop.
		// a. Assume an order and work out the final bill.
		// b. Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20,
		// Large Pizza: $25
		// c. For additional pepperoni topping: Pepperoni for Small Pizza: +$2,Pepperoni
		// for Medium
		// or Large Pizza: +$3
		// d. Extra cheese for any size pizza: + $1
		// For eg: If the Pizza is medium, pepperoni with extra cheese the program
		// should calculate the
		// final bill as 20+3+1 = $24 and print as
		// “Your final bill is $24

		String typeOfPizza = "Small";
		int priceOfSmallCheesePizza = 15;
		int priceOfMediumCheesePizza = 20;
		int priceOfLargeCheesePizza = 25;
		int priceOfPepporoniS = 2;
		int priceOfPepporoniMAndL = 3;
		int priceOfExtraCheese = 1;
		int pizzaQuantity = 1;
		int quantityOfPepporoni = 2;
		int quantityOfExtraCheese = 1;
		int rateOfPizza = 0;
		boolean isPizzaPurchased = false;

		if (pizzaQuantity > 0) {

			switch (typeOfPizza) {
			case "Small":
				isPizzaPurchased = true;
				System.out.println("Ordered " + pizzaQuantity + " small cheese pizza  ");
				rateOfPizza = priceOfSmallCheesePizza * pizzaQuantity;
				if (quantityOfPepporoni > 0) {
					System.out.println("Added " + quantityOfPepporoni + " toppings of pepporoni");
					rateOfPizza = rateOfPizza + (priceOfPepporoniS * quantityOfPepporoni);
				}
				break;

			case "Medium":
				isPizzaPurchased = true;
				System.out.println("Ordered " + pizzaQuantity + " Medium cheese pizza  ");
				rateOfPizza = priceOfMediumCheesePizza * pizzaQuantity;
				if (quantityOfPepporoni > 0) {
					System.out.println("Added" + quantityOfPepporoni + " topping of pepporoni");
					rateOfPizza = rateOfPizza + (priceOfPepporoniMAndL * quantityOfPepporoni);
				}
				break;

			case "Large":
				isPizzaPurchased = true;
				System.out.println("Ordered " + pizzaQuantity + " Large cheese pizza ");
				rateOfPizza = priceOfLargeCheesePizza * pizzaQuantity;
				if (quantityOfPepporoni > 0) {
					System.out.println("Added " + quantityOfPepporoni + " toppings of pepporoni ");
					rateOfPizza = rateOfPizza + (priceOfPepporoniMAndL * quantityOfPepporoni);
				}
				break;

			default:
				System.out.println("Invalid size");
				break;
			}

			if ((quantityOfExtraCheese > 0) && (isPizzaPurchased)) {
				System.out.println("Added " + quantityOfExtraCheese + " toppings of cheese");
				rateOfPizza = rateOfPizza + (priceOfExtraCheese * quantityOfExtraCheese);
			}
			System.out.println("Final bill is $" + rateOfPizza);

		} else {
			System.out.println("Order pizza");
		}

	}
}
