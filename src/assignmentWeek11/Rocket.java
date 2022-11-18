package assignmentWeek11;

public class Rocket implements SpaceShip {
	private int rocketCost;
	private int rocketWeight;
	private int maxWeight;
	protected int cargoCarried = 0;
	protected int cargoLimit;

	public Rocket(int rocketCost, int rocketWeight, int maxWeight) {
		super();
		this.rocketCost = rocketCost;
		this.rocketWeight = rocketWeight;
		this.maxWeight = maxWeight;
		this.cargoLimit = maxWeight - rocketWeight;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if ((cargoCarried + item.weight) <= (cargoLimit * 1000)) {
			return true;
		}
		return false;
	}

	@Override
	public double carry(Item item) {
		cargoCarried = cargoCarried + item.weight;
		return cargoCarried;
	}

	public int getRocketCost() {
		return rocketCost;
	}
}
