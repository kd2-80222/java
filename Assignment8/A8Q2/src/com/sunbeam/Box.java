package com.sunbeam;

public class Box<t> {
	private t obj;
	
	public void set(t obj)
	{
		this.obj=obj;
	}
	
	public t get()
	{
		return this.obj;
	}
}
