
public class TankCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method
		// There is a water tank of capacity 100 liters. Water is filled into it using
		// bucket which have capacity of 10 liters. Write a program which fills the tank
		// to its capacity using these buckets.
		// Also include a mechanism in your program to stop the tank from over flowing.

		int maxTankCapacity = 100;
		int initialLevelOfWater = 48;
		for (int waterInsideTank = initialLevelOfWater; waterInsideTank <= (maxTankCapacity
				- 3); waterInsideTank += 10) {
			System.out.println("Water inside the tank is " + waterInsideTank + " liters and  can pour "
					+ ((maxTankCapacity - 3) - waterInsideTank) + " more liters of water");
			int tempWaterLevel = waterInsideTank + 10;
			if (tempWaterLevel >= maxTankCapacity - 3) {
				System.out.println("Cannot  add more water . Water tank can hold only " + (maxTankCapacity - 3)
						+ " liters of water");
				break;
			}

		}

	}

}
