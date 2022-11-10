package assignmentWeek10;

import java.util.Scanner;

public class UserDetails {
	private String emailId;
	private String password;
	private String name;
	private String phoneNumber;
	Scanner sc = new Scanner(System.in);

	protected void userRegisteration() {
		userEmailInput();
		userPasswordInput();
		userFullNameInput();
		userPhoneNumberInput();
	}

	private void userEmailInput() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter your email address.");
			String emailId = sc.nextLine();

			isValid = validateEmailID(emailId);
			if (isValid) {
				this.emailId = emailId;
				break;
			}
		}
	}

	private void userPasswordInput() {
		boolean isValid = false;
		while (!isValid) {

			System.out.println("Enter the password that you want to use");
			String password = sc.nextLine();
			isValid = validatePassword(password);

			if (isValid) {
				this.password = password;
				break;
			}
		}
	}

	private void userFullNameInput() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter the full name");
			String fullName = sc.nextLine();
			isValid = validateFullName(fullName);

			if (isValid) {
				this.name = fullName;
				break;
			}
		}
	}

	private void userPhoneNumberInput() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter the phone number");
			String phoneNumber = sc.nextLine();
			isValid = validatePhoneNumber(phoneNumber);
			if (isValid) {
				this.phoneNumber = phoneNumber;
				break;
			}
		}
	}

	private boolean validateEmailID(String emailId) {

		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		if (emailId.matches(regex)) {
			return true;
		} else {
			System.out
					.println("Please enter valid email id with @ symbol,domain name along with dot and end sentance  ");
		}
		return false;
	}

	private boolean validatePassword(String password) {

		String regex = ("(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
		if (password.matches(regex)) {
			return true;
		} else {
			System.out.println(
					"Enter valid password with minumum 8 charecter,atleast one special charecter and atleast one digit ");
		}
		return false;
	}

	private boolean validateFullName(String fullName) {

		String regex = "^[a-zA-Z].*[\\s\\.]*$";
		if (fullName.matches(regex)) {
			return true;
		} else {
			System.out.println("Enter valid name with only albhabets ");
		}
		return false;
	}

	private boolean validatePhoneNumber(String phoneNumber) {

		String regex = "\\A[0-9]{10}\\z";
		if (phoneNumber.matches(regex)) {
			return true;
		} else {
			System.out.println("Enter valid name only with 10 digits  ");
		}
		return false;
	}

	private boolean validateCredentials(String loginUserName, String loginPassword) {
		if (this.emailId.equals(loginUserName) && (this.password.equals(loginPassword))) {
			return true;
		} else {
			System.out.println("Email and password is not valid");
		}
		return false;

	}

	// validating loggin functioality
	protected void validateUserCredentials() {
		int invalidCredentlTry = 0;
		while (invalidCredentlTry < 3) {
			System.out.println("Enter the email ID to login");
			String loginUsername = sc.next();
			System.out.println("Enter password to login");
			String loginPassword = sc.next();
			// Consumes new line leftover
			sc.nextLine();

			// Validating the credentials
			if (!validateCredentials(loginUsername, loginPassword)) {
				System.out.println("enter valid credentials");
			} else {
				System.out.println("You have successfully logged in");
				break;
			}
			invalidCredentlTry++;
		}
		if (invalidCredentlTry > 2) {
			System.out.println("You have reached your max attempt");
			System.exit(invalidCredentlTry);
		}
	}

}
