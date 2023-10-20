package com.sunbeam;

public class Clerk  implements Emp{
	private double salary;
	
	public Clerk() { }

	@Override
	public double getsal() {
		
		return this.getSalary();
	}
	
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
