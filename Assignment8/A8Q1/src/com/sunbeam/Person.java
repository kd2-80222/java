package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String fname;
	private String lname;
	
	public Person() {
		
	}
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name :" );
		fname=sc.next();
		System.out.println("Last Name :" );
		lname=sc.next();
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
	
	

}
