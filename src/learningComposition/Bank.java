package learningComposition;

public class Bank {
	private String bankName;
	Employee[] employee = new Employee[10];

	public void addEmployeeToBank(Employee employee) {
		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = employee;
				break;
			}
		}
	}
	
	public void getEmployeeDetails(String enteredName) {
		for(int i=0;i<employee.length;i++) {
			if(employee[i].getEmployeeName().equalsIgnoreCase(enteredName)){
				System.out.println(String.format("Employee name  : %S",employee[i].getEmployeeName()));
				System.out.println(String.format("ID : %s", employee[i].getEmployeeID()));
				System.out.println(String.format("Designation : %s", employee[i].getEmployeeDesignation()));
			}
		}
	}

}
