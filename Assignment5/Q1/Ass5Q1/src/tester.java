
public class tester {
	public static void main(String[] args) {
		System.out.println("***************************");
		System.out.println("SALARIED EMPLOYEE");
		Employee e2=new SalariedEmployee();
		e2.accept();
		e2.toString();
		e2.totalSalary();
		System.out.println(e2);
		
		System.out.println("***************************");
		System.out.println("COMMISIION EMPLOYEE");
		Employee e1=new CommissionEmployee();
		e1.accept();
		e1.toString();
		e1.totalSalary();
		System.out.println(e1);
		System.out.println("***************************");
		System.out.println("HOURLY EMPLOYEE");
		Employee e3=new HourlyEmployee();
		e3.accept();
		e3.toString();
		e3.totalSalary();
		System.out.println(e3);
		System.out.println("***************************");
		System.out.println("BASEPLUSCOMMISSIONE EMPLOYEE");
		Employee e4=new BasePlusCommissionEmployee();
		e4.accept();
		e4.toString();
		e4.totalSalary();
		System.out.println(e4);

		
	}
}
