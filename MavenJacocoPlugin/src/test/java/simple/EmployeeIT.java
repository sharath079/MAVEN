package simple;

import test.Employee;

public class EmployeeIT {
	
	Employee emp=new Employee();
	
	public void testEmp() {
		emp.setEmpid(1000);
		emp.setEmpname("Satish");
		emp.setDesg("Soft Developer");
		
		System.out.println(emp.toString());
	}

}
