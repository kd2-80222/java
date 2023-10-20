package com.sunbeam;

public class Manager implements Emp {
	double basicSalary;
	double dearanceAllowance;
	
	@Override
	public double getsal() {
		
		double getsal= this.basicSalary + this.dearanceAllowance;
		return getsal;
	}
	public double calcIncentives() 
	{
		return this.basicSalary*0.20;
	}
	
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDearanceAllowance() {
		return dearanceAllowance;
	}
	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	public Manager(double basicSalary, double dearanceAllowance) {
		
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
	

}
