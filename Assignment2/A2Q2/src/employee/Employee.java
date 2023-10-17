/*Q2. Create a class called Employee that includes three fields—a first name (type String), 
a last name (type String) and a monthly salary (double). Provide a constructor that 
initializes the three instance variables. Provide a set and a get method for each instance 
variable. If the monthly salary is not positive, do not set its value. Write a test 
application named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */
package employee;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private double yearlySalary;
	private double increment;

	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptEmployee() {

		Scanner sc = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.print("Enter the first name: ");
		firstName = sc.next();
		System.out.print("Enter the last name: ");
		lastName = sc.next();
		System.out.print("Enter the salary: ");
		salary = sc.nextDouble();
		if (salary > 0)
			this.salary = salary;
		else
			this.salary = (Double) null;
	}

	public void yearlySalary() {
		yearlySalary = salary * 12;
		System.out.println("The yearly salary is: " + yearlySalary);
	}

	public void increment() {
		increment = yearlySalary + (yearlySalary * 0.1);
		System.out.println("The increment is: " + increment);
	}

	public void displayEmployee() {
		System.out.println("****************************************");
		System.out.println("The Employee Details are: ");
		System.out.println("The first name is: " + firstName);
		System.out.println("The last name is: " + lastName);
		System.out.println("The salary is: " + salary);

	}

}