package com.snbeam;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



public class LisnkedListMain {
	
	public static void main(String[] args) {
		LinkedList<Employee> llist= new LinkedList<Employee>();
		int choice;
		do {
			System.out.println("***************** MENU *********************");
			System.out.println("0.EXIT");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Find Employee");
			System.out.println("4.Sort Employee");
			System.out.println("5.Update Employee");
			System.out.println("********************************************");

			System.out.println("Enter your choice");
			
			class EMployeeSortComprator implements Comparator<Employee>
			{

				@Override
				public int compare(Employee e1, Employee e2) {
					int diff = e1.getName().compareTo(e2.getName());
					return diff;
				}
				
			}
			EMployeeSortComprator cmp = new EMployeeSortComprator();
			
			Scanner sc= new Scanner(System.in);
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				Employee e = new Employee();
				e.accept();
				llist.add(e);
				System.out.println("You added employee");
				break;
			case 2:
				llist.remove();
				System.out.println("You deleted employee");
				break;
			case 3:
				System.out.println("Enter id of employee to search ");
				int id1= sc.nextInt();
				Employee e1 =new Employee();
				e1.setId(id1);
				if(!(llist.indexOf(e1)== -1))
					System.out.println("Employee found at index" + llist.indexOf(e1));
				else
					System.out.println("Employee is not in the list");
				break;
			case 4:
				llist.sort(cmp);
				{for (Employee ele : llist)
					ele.display();
				System.out.println();}
				break;
			case 5:
				System.out.println("Enter empid to be modified");
				int empid = sc.nextInt();
				Employee key = new Employee();
				key.setId(empid);
				int index = llist.indexOf(key);
				if (index == -1) 
				{
					System.out.println("Employee not found");
				} else 
				{
					Employee oldemp = llist.get(index);
					System.out.println("Employee found : ");
					oldemp.display();
					System.out.println("Enter new information of employee");
					Employee newemp= new Employee();
					newemp.accept();
					llist.set(index, newemp);
				};
			
				break;
			default:
				break;
			}
			
		} while (choice != 0);
		
	}

}
