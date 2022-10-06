

public class TankCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method
		// There is a water tank of capacity 100 liters. Water is filled into it using
		// bucket which have capacity of 10 liters. Write a program which fills the tank
		// to its capacity using these buckets.
		// Also include a mechanism in your program to stop the tank from over flowing.

		int maxTankCapacity = 100;
		// one bucket hold 10 liters of water
		for (int litersOfWaterPoured = 10; litersOfWaterPoured <= 1000; litersOfWaterPoured += 10) {

			System.out.println(litersOfWaterPoured + " liters of water is poured and can have "
					+ (maxTankCapacity - litersOfWaterPoured) + " more liter of water.");
			if (litersOfWaterPoured == maxTankCapacity) {
				System.out.println("Water tank reached maximun capacity of water");
				break;
			}

		}

	}

}