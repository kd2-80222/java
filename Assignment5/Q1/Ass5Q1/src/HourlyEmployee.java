import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private int hours;
	private double wage;
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(String firstName, String lastName, int sSN, int hours, double wage) {
		super(firstName, lastName, sSN);
		this.hours = hours;
		this.wage = wage;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		super.accept();
		System.out.println("Enter Wage per hour : ");
		wage=sc.nextDouble();
		System.out.println("Enter Hours worked :");
		this.hours=sc.nextInt();
		
	}

	@Override
	public void totalSalary() {
		double totalsalary=0;
		if(hours<=40)
			totalsalary=wage * hours;
		else if (hours > 40) 
			totalsalary=40*wage + (hours -40)*wage * 1.5;
		
		System.out.println("Total salary :" + totalsalary);
	}

	@Override
	public String toString() {
		return super.toString()+"HourlyEmployee [hours=" + hours + ", wage=" + wage + "]";
	}
	
	

}
