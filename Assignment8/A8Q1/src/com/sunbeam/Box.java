package com.sunbeam;

public class Box<T extends Employee> {
	private T obj;
	
	public void set(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return this.obj;
	}
	
	public double getTotalSalary()
	{
		return obj.totalsalary();
	}
	
}
