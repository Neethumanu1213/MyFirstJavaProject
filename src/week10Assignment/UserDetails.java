package week10Assignment;

import java.util.Scanner;

public class UserDetails {
	private String emailId;
	private String password;
	private String name;
	private String phoneNumber;
	Scanner sc = new Scanner(System.in);

	public void userRegisteration() {
		validateAndSetEmail();
		validateAndSetPassword();
		validateAndSetFullname();
		validateAndSetPhoneNumber();
	}

	private void validateAndSetEmail() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter your email address.");
			String emailId = sc.nextLine();
			if (emailId.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
				this.emailId = emailId;
				isValid = true;
			} else {
				System.out.println(
						"Please enter valid email id with @ symbol,domain name along with dot and end sentance  ");
			}
		}
	}

	private void validateAndSetPassword() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter the password that you want to use");
			String password = sc.nextLine();
			if (password.matches(("(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"))) {
				this.password = password;
				isValid = true;
			} else {
				System.out.println(
						"Enter valid password with minumum 8 charecter,atleast one special charecter and atleast one digit ");
			}
		}
	}

	private void validateAndSetFullname() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter the full name");
			String fullName = sc.nextLine();
			if (fullName.matches("^[a-zA-Z].*[\\s\\.]*$")) {
				this.name = fullName;
				isValid = true;
			} else {
				System.out.println("Enter valid name with only albhabets ");
			}
		}
	}

	private void validateAndSetPhoneNumber() {
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Enter the phone number");
			String phoneNumber = sc.nextLine();
			if (phoneNumber.matches("\\A[0-9]{10}\\z")) {
				this.phoneNumber = phoneNumber;
				isValid = true;
			} else {
				System.out.println("Enter valid name only with 10 digits  ");
			}
		}
	}

	public void validateUserCredentials() {
		int invalidCredentlTry = 0;
		while (invalidCredentlTry < 3) {
			System.out.println("Enter the email ID to login");
			String loginUsername = sc.next();
			System.out.println("Enter password to login");
			String loginPassword = sc.next();
			sc.nextLine();
			if (!(this.emailId.equals(loginUsername) && (this.password.equals(loginPassword)))) {
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
