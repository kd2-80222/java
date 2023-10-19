package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A11Q6 {
	public static void main(String[] args) {
		
		Map<Integer,Student> map = new LinkedHashMap<>();
		
		int choice;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Student");
			System.out.println("2.Search Student");
			System.out.println("Enter choice");
			Scanner sc= new Scanner(System.in);
			choice= sc.nextInt();
			
			switch (choice) {
			case 1:
				Student s = new Student();
				System.out.println("Enter Rollno");
				int rollno1=sc.nextInt();
				s.setRollno(rollno1);
				System.out.println("Enter Name");
				String name1=sc.next();
				s.setName(name1);
				
				map.put(s.getRollno(), s);
				
				break;
			case 2:
				System.out.println("Enter Rollno to search student");
				int rollno2= sc.nextInt();
				s=map.get(rollno2);
				System.out.println(s);
				break;

			default:
				break;
			}
			
			
		} while (choice !=0);
		
	}

}
