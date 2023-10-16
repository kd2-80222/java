package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable {
	
	private String name;
	private int age;
	public Person() { }
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void accept()
	{
		System.out.println("Enter Name");
		Scanner sc= new Scanner(System.in);
		this.name=sc.next();
		System.out.println("Enter Age");
		this.age=sc.nextInt();
	}

	@Override
	public void Show() {
		
		System.out.println("Name:"+name);
		System.out.println("Age : "+age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
