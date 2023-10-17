
package employeetest;

import employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee em=new Employee("Nikita", "Joshi", 50000);
		em.displayEmployee();
		em.acceptEmployee();
		em.yearlySalary();
		em.increment();
	}

}