package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person {
	private double salary;
	private int id;

	public Employee(String fname, String lname,double salary) {
		super(fname, lname);
		this.salary=salary;
	}
public Employee() {
		
	}

	abstract double totalsalary();
//	public void totalSalary()
//	{
//		System.out.println("Total Salary :"+salary);
//	}
	public  void accept()
	{
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter ID");
		this.id=sc.nextInt();
		System.out.println("Enter Salary");
		this.salary=sc.nextDouble();
	}
	

	@Override
	public String toString() {
		return super.toString()+"Employee [salary=" + salary + ", id=" + id + "]";
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
