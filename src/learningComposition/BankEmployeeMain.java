package learningComposition;

import java.util.Scanner;

public class BankEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		Employee neethu = new Employee("Neethu", "12345", "Clerk");
		Employee lekshmi = new Employee("Lekshmi", "12346", "Cashier");
		Employee harinder = new Employee("Harinder", "12347", "Manager");
		Employee rajbir = new Employee("Rajbir", "12348", "Cashier");
		Employee jasmeet = new Employee("Jasmeet", "12349", "Clerk");
		Employee parul = new Employee("Parul", "12340", "Supervisor");
		Employee santhi = new Employee("Santhi", "12341", "Assistance manager");
		Employee sahib = new Employee("Sahib", "12342", "Clerk");
		Employee kuldeep = new Employee("Kuldeep", "12343", "Clerk");
		Employee navjot = new Employee("Navjot", "12344", "Clerk");
		
		Scanner sc=new Scanner(System.in);

		bank.addEmployeeToBank(neethu);
		bank.addEmployeeToBank(lekshmi);
		bank.addEmployeeToBank(harinder);
		bank.addEmployeeToBank(rajbir);
		bank.addEmployeeToBank(jasmeet);
		bank.addEmployeeToBank(parul);
		bank.addEmployeeToBank(santhi);
		bank.addEmployeeToBank(sahib);
		bank.addEmployeeToBank(kuldeep);
		bank.addEmployeeToBank(navjot);

		System.out.println(String.format(
				"Enter the name you want to get the details \nNeethu"+
				"\nLekshmi \nHarinder \nRajbir \nJasmeet \nParul \nSanthi \nSahib \nKuldeep \nNavjot"));
		
		String enteredName=sc.nextLine();
		bank.getEmployeeDetails(enteredName);

	}

}
