package learningComposition;

public class Employee {
	private String employeeName;
	private String employeeID;
	private String employeeDesignation;
	
	public Employee(String employeeName, String employeeID, String employeeDesignation) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	
	

}
