
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
		this.weeklySalary = 10000;
	}
	
	public SalariedEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		this.weeklySalary = 10000;
		
	}
	
	@Override
	public void totalSalary() {
		System.out.println("Salaried  employee salary :"+ weeklySalary);
		
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

	
	
	
	

}
