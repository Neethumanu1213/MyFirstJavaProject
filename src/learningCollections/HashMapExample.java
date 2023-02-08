package learningCollections;

import java.util.HashMap;
import java.util.Iterator;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> nameList=new HashMap<Integer,String>();
		//adding the key values to the hashmap
		nameList.put(101, "Neethu");
		nameList.put(102, "Manu");
		nameList.put(103, "Unni");
		nameList.put(104, "Adithya");
		nameList.put(103, "Vishnu");
		
		//printing the nameList
		System.out.println("The key value pairs are "+nameList);
		//to string method for string value representation
		System.out.println(nameList.toString());
		
		//remove one key and value
		nameList.remove(103);
		System.out.println(nameList.toString());
		
		//check the key is present or not
		System.out.println(nameList.containsKey(103));
		
		//check contains by value
		System.out.println(nameList.containsValue("Neethu"));
		
		//get method to get the key and equals method
		System.out.println(nameList.get(101).equals("Neethu"));
		
		//check the hashmap is empty or not
		System.out.println(nameList.isEmpty());
		
		//Set set=nameList.entrySet();
		Iterator<?> iterator=nameList.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	}

}
