package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails employeeDetails = new EmployeeDetails("Manu", 233, 1409.0, "Team Lead");

		System.out.println("Employee name is : " + employeeDetails.getEmployeeName());
		System.out.println("Employement id is : " + employeeDetails.getEmployeeID());
		System.out.println("Current Salary: " + employeeDetails.getSalary());

		// adding bonus to the salary
		employeeDetails.setSalary(1409.0, 500.0);
		System.out.println("Salary after bonus is: " + employeeDetails.getSalary());

		// to change the designation
		employeeDetails.setDesignation("Team Lead", "Manager", true);
		System.out.println("Designation is :" + employeeDetails.getDesignation());
	}

}
