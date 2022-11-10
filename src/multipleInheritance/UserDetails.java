package multipleInheritance;

public class UserDetails {
	String name = "Neethu";
	int noOfPassengers=2;

	public UserDetails() {
		super();
	}

	public void display() {
		System.out.println("Passenger name :"+name);
		System.out.println("No of passengers :"+noOfPassengers);
	}
}
