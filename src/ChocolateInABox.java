

public class ChocolateInABox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that will keep adding 5 chocolates to a box which
		// already has 27 chocolates and add a mechanism that number of
		// chocolates should never go above 63

		int maxChocolateCanHold = 63;
		// chocolate box already contain 27 chocolates
		for (int chocolateInBox = 27; chocolateInBox <= 100; chocolateInBox += 5) {
			System.out.println("The box contain " + chocolateInBox + " chocolates");
			// Giving temporary value to check the chocolate count
			int tempValue = chocolateInBox + 5;
			if (tempValue > maxChocolateCanHold) {

				System.out.println("Box reached it max capacity");
				break;
			}
		}

	}

}
