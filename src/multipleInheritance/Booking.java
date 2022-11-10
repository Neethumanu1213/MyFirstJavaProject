package multipleInheritance;

public class Booking extends UserDetails {
	double ticketCharge=100;
	double charges;
	

	public Booking() {
		super();
		
	}
	public void bookingProcess() {
		charges=ticketCharge*noOfPassengers;
	}
	

}
