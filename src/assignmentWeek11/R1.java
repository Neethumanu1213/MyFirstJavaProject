package assignmentWeek11;

public class R1 extends Rocket {

	public R1(int rocketCost, int rocketWeight, int maxWeight) {
		super(rocketCost, rocketWeight, maxWeight);
	}

	@Override
	public boolean launch() {
		double chanceOfLaunchingExplosion = 0.05 * (cargoCarried / (cargoLimit * 1000));
		if (chanceOfLaunchingExplosion < (Math.random() / 10)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		double chanceOfLandingCrash = 0.01 * (cargoCarried / (cargoLimit * 1000));
		if (chanceOfLandingCrash < (Math.random() / 10)) {
			return true;
		}
		return false;
	}
}
