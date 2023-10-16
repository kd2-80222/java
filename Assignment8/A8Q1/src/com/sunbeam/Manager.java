package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	private double commission;
	
public Manager() {
		
	}
	public Manager(String fname, String lname, double salary,double commission) {
		super(fname, lname, salary);
		this.commission=commission;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter commission");
		Scanner sc= new Scanner(System.in);
		commission=sc.nextDouble();
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [commission=" + commission + "]";
	}
//	@Override
//	public void totalSalary() {
//		double totalsalary=	super.getSalary()+ commission;
//		System.out.println("Total salary : "+ totalsalary);
//	}
	@Override
	double totalsalary() {
		double totalsalary=	super.getSalary()+ commission;
		System.out.println("Total salary : "+ totalsalary);
		return totalsalary;
	}

}
