package assignmentWeek11;

public class R2 extends Rocket {

	public R2(int rocketCost, int rocketWeight, int maxWeight) {
		super(rocketCost, rocketWeight, maxWeight);
	}

	@Override
	public boolean launch() {
		double chanceOfLaunchingExplosion = 0.04 * (cargoCarried / (cargoLimit * 1000));
		if (chanceOfLaunchingExplosion < (Math.random() / 10)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		double chanceOfLandingCrash = 0.08 * (cargoCarried / (cargoLimit * 1000));
		if (chanceOfLandingCrash < (Math.random() / 10)) {
			return true;
		}
		return false;
	}
}
