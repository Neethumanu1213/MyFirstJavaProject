package learningCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration of ArrayList
		ArrayList<Students> studentsList = new ArrayList<Students>();
		
		//Creating instance of class 
		Students neethu = new Students("Neethu", "101");
		Students manu = new Students("Manu", "102");
		Students adithya = new Students("Adithya", "103");
		Students unni = new Students("Unni", "104");

		//Adding object to the list
		studentsList.add(neethu);
		studentsList.add(manu);
		studentsList.add(adithya);
		studentsList.add(unni);
		
		// iterating over the the arraList to display the name and roll num
		System.out.println("The arraylist objects are ");
		for (int i = 0; i < studentsList.size(); i++) {
			System.out.println( studentsList.get(i).getName() + " "
					+ studentsList.get(i).getRollNum());
		}
		
		//iterating the arrayList using iterator
		Iterator<Students> iterator=studentsList.iterator();
		while(iterator.hasNext()) {
		System.out.println(	iterator.next().getName());
		}
		
		//iterating using list iterator
		ListIterator<Students> iterator2=studentsList.listIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next().getRollNum());
		}
		
		ListIterator<Students> iterator3=studentsList.listIterator();

		//iterating and printing both at a a time
		while(iterator3.hasNext()) {
			Students students=iterator3.next();
			System.out.println(students.getName()+" "+students.getRollNum());		
		}		
	}
}
