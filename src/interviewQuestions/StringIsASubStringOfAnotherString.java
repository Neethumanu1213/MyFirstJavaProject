package interviewQuestions;

public class StringIsASubStringOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "for";
		String string2 ="Forever";
		if(string2.toLowerCase().contains(string1.toLowerCase())) {
			System.out.println(String.format("%s is a substring of %s ", string1,string2));
			
		}else {
			System.out.println(String.format("%s is not  a substring of %s ", string1,string2));
		}
	}

}
