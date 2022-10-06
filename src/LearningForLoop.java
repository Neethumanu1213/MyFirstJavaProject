
public class LearningForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actualCapacity = 3;

		for (int counter = 1; counter < 20; counter++) {
			System.out.println(
					"I can drink " + counter + " cup of juice and i can have " + (actualCapacity - counter) + " more");
			if (counter == actualCapacity) {
				System.out.println("I reached my max capacity");
				System.out.println("hello");
				break;
			}
		}

	}
}
