package com.sunbeam;

public class Q2Main {
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().Show();
	}
	
	public static void printanyBox(Box<?> b)
	{
		System.out.println(b.get().toString());
	}
	
	public static void main(String[] args) {
		
		Box<Person> p= new Box<>();
		p.set(new Person());
		p.get().accept();
		p.get().Show();
		printDisplayableBox(p);
		printanyBox(p);
		
		Box<Date> d= new Box<>();
		d.set(new Date());
		d.get().accept();
		d.get().Show();
		printanyBox(d);
	}
}
