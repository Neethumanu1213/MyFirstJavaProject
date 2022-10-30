package assignmentWeek7;

public class UserDetails {
	private String userName;
	private String password;
	private String name;
	private int phoneNumber;

	public UserDetails(String userName, String password, String name, int phoneNumber) {

		this.userName = userName;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		System.out.println("Thank you for registering!");
	}

	// to validate the credentials
	boolean validateCredentials(String loginUserName, String loginPassword) {
		if (this.userName.equals(loginUserName) && (this.password.equals(loginPassword))) {
			return true;
		}
		return false;

	}

	// to validate the password
	boolean validatePassword(String existingPassword) {
		if (this.password.equals(existingPassword)) {
			return true;
		}
		return false;

	}

	// method to set username
	public void setUserName(String newUserName) {

		if (userName.equals(newUserName)) {
			System.out.println("Username entered is already existing.Try again later");
		} else {
			this.userName = newUserName;
			System.out.println("Username is changed successfully");

		}
	}

	public void setPassword(String newPassword) {
		if (password.equals(newPassword)) {
			System.out.println("Password entered is already existing.Try again later");
		} else {
			this.password = newPassword;
			System.out.println("Password is changed successfully");

		}

	}

	public void setPhoneNumber(int newPhoneNumber) {
		if (phoneNumber == newPhoneNumber) {
			System.out.println("Phone number entered is already existing.Try again later");
		} else {
			this.phoneNumber = newPhoneNumber;
			System.out.println("Phone is changed successfully");

		}

	}

}
