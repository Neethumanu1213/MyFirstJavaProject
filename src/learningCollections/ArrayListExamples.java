package learningCollections;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList declaration
		ArrayList<String> nameArrayList = new ArrayList<String>();
		nameArrayList.add("Neethu");
		nameArrayList.add("Manu");
		nameArrayList.add("Adithya");
		
		//printing the arrayList elements
		System.out.println("The elements in actual ArrayList is "+nameArrayList);
		
		//adding objects in indexs
		nameArrayList.add(2, "Vishnu");
		nameArrayList.add(0, "Uniikrishnan");
		System.out.println("The arrayList after adding names "+nameArrayList);
		
		//check the size of the ArrayList
		System.out.println("The length of the element is "+nameArrayList.size());
		
		//to check the object is present and the remove it
		if(nameArrayList.contains("Vishnu")) {
			nameArrayList.remove("Vishnu");
		}else {
			System.out.println("Name os not present");
		}
		System.out.println("The arrayList after removing the object "+nameArrayList);
		
		//String representation of arraylist
		System.out.println(nameArrayList.toString());
		
		//to clear the object
		//nameArrayList.clear();
		System.out.println("The arrayList after removing the object "+nameArrayList);
		
		//iterate over the loop and get the objects
		boolean isPresent=false;
		for(int i=0;i<nameArrayList.size();i++) {
			if(nameArrayList.get(i).contains("vishnu")) {
				System.out.println(nameArrayList.get(i)+" is present");
				isPresent=true;
				break;
			}			
		}
		if(!isPresent) {
			System.out.println("name is not present");
		}
	}

}

