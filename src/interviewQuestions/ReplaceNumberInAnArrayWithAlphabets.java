//Write a program to replace the numbers in an array with alphabets

package interviewQuestions;

public class ReplaceNumberInAnArrayWithAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numList = { 12, 11, 11, 14, 90 };
		//String[] convertedNumList = new String[numList.length];
		for (int i = 0; i < numList.length; i++) {
			String convert=String.valueOf(numList[i]);
			//convertedNumList[i] =  String.valueOf(numList[i]);
			System.out.println( convert);
		}
		
	}

}
