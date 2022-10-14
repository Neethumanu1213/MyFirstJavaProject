package learningMethods;

public class LicenceMethod {
	String licenseToBeApplied(String currentLicense) {
		String licenseApplied="";
		if (currentLicense.equals("No License")) {
			licenseApplied = "G1";
		} else if (currentLicense.equals("G1")) {
			licenseApplied = "G2";
		} else if (currentLicense.equals("G2")) {
			licenseApplied = "G";
		} else {
			licenseApplied = "You alreay have license";
		}

		return licenseApplied;
	}
}
