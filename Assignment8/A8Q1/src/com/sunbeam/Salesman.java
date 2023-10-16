package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{
	private double bonus;
public Salesman() {
		
	}
	
	public Salesman(String fname, String lname, double salary,double bonus) {
		super(fname, lname, salary);
		this.bonus=bonus;
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		super .accept();
		System.out.println("ENter bonus:");
		this.bonus=sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"Salesman [bonus=" + bonus + "]";
	}
	@Override
	double totalsalary() {
		
		double totalsalary=	super.getSalary()+ bonus;
		System.out.println("Total salary : "+ totalsalary);
		return totalsalary;
	}
	

}
