package com.snbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		
	}
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		this.id=sc.nextInt();
		System.out.println("Enter employee name");
		this.name=sc.next();
	}
	
	public void display()
	{
		
		System.out.println("Employee ID : " +  id);
		System.out.println("Employee NAME : "+  name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	
	
	
	
	

}
