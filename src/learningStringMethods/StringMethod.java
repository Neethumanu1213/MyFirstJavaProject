package learningStringMethods;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Last name and first name
		String neethuFullName="Neethu Paikkattumana Unnikrishnan";
		
		// to mask the last name

		System.out.println("Masking the last name :"+neethuFullName.replaceAll("Unnikrishnan" , "************"));
		
		// To find the index of last name and printing the first name
		int indexOfLastName=neethuFullName.indexOf("Paikkattumana Unnikrishnan");
		System.out.println("The first name is :"+neethuFullName.substring(0,indexOfLastName));
		
		//To replace the character of name
		System.out.println("New name with a instead of u :"+ neethuFullName.toLowerCase().replace("u","a"));
		
		//To find the length of the name
		System.out.println("Length of the name is:"+neethuFullName.replace(" ","").length());
		

		//reversing a name
		char []reverseNeethuName=neethuFullName.toCharArray();
		for(int i=neethuFullName.length()-1;i>=0;i--) {
		System.out.print(reverseNeethuName[i]);
		}
		//adding a word in the name
		neethuFullName=neethuFullName.substring(0, 6)+"@"+neethuFullName.substring(10,20)+"@"+neethuFullName.substring(20+1);
		System.out.println("\n"+neethuFullName);
			
		
		}
	

}
