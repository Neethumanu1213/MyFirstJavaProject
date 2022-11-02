package learningStringMethods;

public class LearningStringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Neethu";
		System.out.println("Upper case name is :"+name.toUpperCase());
		
		String name1="NEETHU";
		System.out.println("Lower case name is :"+name.toLowerCase());
		
		String neethuName="Neethu paikkattumana unnikrishnan";
		System.out.println("Length of the name is :"+neethuName.length());
		
		// name without emptynspaces
		System.out.println("The length without space is :"+neethuName.replace(" ", "").length());
		
		//index of
		String fullNameOfNeethu="Neethu Unnikrishnan";
		int indexOfLastName=fullNameOfNeethu.indexOf("Unnikrishnan");
		System.out.println("Index of last name is :"+indexOfLastName);
		
		//substring
		System.out.println(" last name is :"+fullNameOfNeethu.substring(indexOfLastName));
		System.out.println("first name is :"+fullNameOfNeethu.substring(0, indexOfLastName));
	}

}
