//Write a program to remove second character of every word in a sentence.

package interviewQuestions;

public class RemoveSecondCharOfEveryWordInASentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance = "My name is Neethu Paikkattumana Unnikrishnan";
		int replacingIndex = 2;
		String newString="";
		String[] wordListOfSentance = sentance.split(" ");
		String replacedWord = "";
		for (int i = 0; i < wordListOfSentance.length; i++) {
			String wordSelected = wordListOfSentance[i];
			//if(wordSelected.length()>=replacingIndex) {
				replacedWord = wordSelected.substring(0, replacingIndex-1)
						+ wordSelected.substring(replacingIndex );
				 newString=newString+replacedWord+" ";
			}      
	//	}
		System.out.println(newString);
	}

}
