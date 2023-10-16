import java.util.Scanner;

public class CommissionEmployee extends Employee {
	int grossSale;
	double commissionRate;
	public CommissionEmployee(String firstName, String lastName, int sSN, int grossSale, double commissionRate) {
		super(firstName, lastName, sSN);
		this.commissionRate=commissionRate;
		this.grossSale=grossSale;
	}
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		
		super.accept();
		System.out.println("Enter commission Rate :");
		this.commissionRate=sc.nextDouble();
		System.out.println("Enter Gross Sale");
		this.grossSale=sc.nextInt();
		
		
	}
	@Override
	public void totalSalary() {
		double totalsalary=0;
		totalsalary= commissionRate * grossSale;
		System.out.println("Total Salary :" + totalsalary);
	}

	@Override
	public String toString() {
		return super.toString()+"CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + "]";
	}
	

}
