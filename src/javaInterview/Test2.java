package javaInterview;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance="Rintu knows Pintu who does not know chintu";
		int length=sentance.replace(" ", "").length();
		System.out.println("The length of the sentance is "+length);
		String newSentance=sentance.replace("u", "o");
		System.out.println(newSentance);
	}

}
