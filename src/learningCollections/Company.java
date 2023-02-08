package learningCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee parul = new Employee("Parul", "QA");
		Employee neethu = new Employee("Neethu", "Developer");
		Employee jasmeet = new Employee("Jasmeet", "BSA");

		HashMap<Integer, Employee> employeeList = new HashMap<Integer, Employee>();
		employeeList.put(101, neethu);
		employeeList.put(102, parul);
		employeeList.put(103, jasmeet);

		System.out.println(employeeList.get(103).getEmployeeName());

		Iterator<Entry<Integer, Employee>> iterator = employeeList.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Employee> mEntry = iterator.next();
			System.out.println(mEntry.getKey() + "=" + mEntry.setValue(neethu).getEmployeeName());
			employeeList.entrySet().stream().map(e -> e.getValue())
					.filter(s -> s.getEmployeeID().equalsIgnoreCase("QA"))
					.forEach(s -> System.out.println(s.getEmployeeName() + " " + s.getEmployeeID()));

		}
	}

}
