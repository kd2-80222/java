package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable{
	
	private int day;
	private int month;
	private int year;
	public Date() {}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day :");
		this.day=sc.nextInt();
		System.out.println("Enter month :");
		this.month=sc.nextInt();
		System.out.println("Enter year :");
		this.year=sc.nextInt();
	}

	@Override
	public void Show() {
		System.out.println("Date :"+day +"/"+ month +"/" + year );
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
