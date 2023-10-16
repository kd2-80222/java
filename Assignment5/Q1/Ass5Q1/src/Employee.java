import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int SSN;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String lastName, int sSN) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		this.firstName=sc.next();
		System.out.println("Enter Last Name");
		this.lastName=sc.next();
		System.out.println("Enter SSN");
		this.SSN=sc.nextInt();
		
		
	}
	
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}

	abstract public  void totalSalary();

}
