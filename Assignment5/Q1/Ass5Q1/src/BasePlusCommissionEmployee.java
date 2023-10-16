import java.util.Scanner;

public class BasePlusCommissionEmployee  extends CommissionEmployee{
	double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, int sSN, int grossSale,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, sSN, grossSale, commissionRate);
		this.baseSalary=baseSalary;
	}
	public BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter Basic Salary : ");
		this.baseSalary=sc.nextDouble();
		this.baseSalary+=(this.baseSalary*0.1);
		
		
	}
	@Override
	public void totalSalary() {
		double totalsalary;
		totalsalary=(commissionRate*grossSale)+ baseSalary;
		
		System.out.println("Total salary : "+totalsalary);
		
	}

	@Override
	public String toString() {
		return super.toString()+"BasePlusCommissionEmployee [baseSalary=" + baseSalary + "]";
	}
	
}
