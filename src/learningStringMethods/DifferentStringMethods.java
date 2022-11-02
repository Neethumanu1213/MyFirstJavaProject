package learningStringMethods;

public class DifferentStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To compare two strings(case sensitive
		String name1 = "NEETHU";
		String name2 = "neethu";
		if (name1.equals(name2)) {
			System.out.println("Names are same");
		} else {
			System.out.println("Names are different");
		}

		// To compare two strings without case consideration

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("Names are same");
		} else {
			System.out.println("Names are different");
		}

		// to check unnikrishnan is present or not
		String neethuName = "Neethu Unnikrishnan";
		if (neethuName.contains("Unnikrishnan")) {
			System.out.println("Unnikrishnan is present");
		} else {
			System.out.println("Unnikrishnan is not present");
		}

		// to find word in the string of array
		int count = 0;
		String[] nameList = { "Damanpreet", "Amanpreet", "Harpreet", "Jaspreet", "Neethu" };
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].contains("preet")) {
				count++;
			}
		}
		System.out.println("There are " + count + " in the array");
		
		
		//to replace the letters from the word
		String string1="Jathan knows Aman but doesn't know Daman";
		String updatedString=string1.replace("an", "en");
		System.out.println("Updated string is :"+updatedString);

		// To replace the word
		String name = "Neethu Unnikrishnan";
		String updatedName = name.replace("Unnikrishnan", "Manu");
		System.out.println("Updated name is :" + updatedName);
		
		// to change the word in an array
		String[] nameList1 = { "Damanpreet", "Amanpreet", "Harpreet", "Jaspreet", "Neethu" };
		for (int i = 0; i < nameList1.length; i++) {
			if (nameList1[i].contains("preet")) {
			nameList1[i]=nameList1[i].replace("preet", "jeet");
			System.out.println(nameList1[i]);
			} 
		}

	}

}
