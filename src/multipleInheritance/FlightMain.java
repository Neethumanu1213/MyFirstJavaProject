package multipleInheritance;

public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Baggage baggage=new Baggage();
Baggage baggage2=new Baggage();
baggage2=baggage;
System.out.println(baggage2.mawWeightAllowed);
	}

}
