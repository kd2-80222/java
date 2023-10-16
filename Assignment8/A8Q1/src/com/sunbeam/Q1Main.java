package com.sunbeam;

public class Q1Main {
	public static void main(String[] args) {
		
		
		
		
		Box<Salesman> s = new Box<>();
		s.set(new Salesman());
		s.get().accept();
		s.get().toString();
		System.out.println(s.get().toString());
		s.getTotalSalary();
		
		Box<Manager> m = new Box<>();
		m.set(new Manager());
		m.get().accept();
		m.get().toString();
		System.out.println(m.get().toString());
		m.getTotalSalary();
		
		
		
	}

}
