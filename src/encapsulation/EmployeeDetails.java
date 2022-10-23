package encapsulation;

public class EmployeeDetails {
	private String employeeName;
	private int employeeID;
	private double salary;
	private String designation;

	public EmployeeDetails(String employeeName, int employeeID, double salary, String designation) {

		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.salary = salary;
		this.designation = designation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary, double bonus) {
		this.salary = salary + bonus;

	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String currentdesignation, String newDesignation, boolean isAdmin) {
		if (isAdmin) {
			if (currentdesignation.equals(designation))
				this.designation = newDesignation;
		} else {
			System.out.println("Designation only changed by admin");
		}

	}

}
