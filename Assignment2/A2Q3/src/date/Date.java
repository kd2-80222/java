/*Q3. Create a class called Date that includes three fields—a month (type int), a day 
(type int) and a year (type int). Provide a constructor that initializes the three instance 
variables and assumes that the values provided are correct. Provide a set and a get method
for each instance variable. Provide a method displayDate that displays the month, day and 
year separated by forward slashes (/). Write a test application named DateTest that 
demonstrates class Date’s capabilities.*/

package date;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void acceptDate() {

		Scanner sc = new Scanner(System.in);

		System.out.println("**************************************");
		System.out.print("Enter the day: ");
		day = sc.nextInt();
		if (day <= 31 && day > 0)
			this.day = day;
		else 
		{
			System.out.println("Enter valid day");
			System.exit(0);
		}
		

		System.out.print("Enter the month: ");
		month = sc.nextInt();
		if (month <= 12 && month > 0)
			this.month = month;
		else 
		{
			System.out.println("Enter valid month");
			System.exit(0);
		}

		System.out.print("Enter the year: ");
		year = sc.nextInt();
	}

	public void displayDate() {
		System.out.println("**************************************");
		System.out.println("The Date is: " + day + "/" + month + "/" + year);
	}
}