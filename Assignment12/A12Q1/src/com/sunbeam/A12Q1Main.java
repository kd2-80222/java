package com.sunbeam;

import java.util.ArrayList;
import java.util.List;



public class A12Q1Main {
	
	public static void main(String[] args) {
		
		Emp[] arr = new Emp[3];
		arr[0]=(new Manager(20000.0, 2000.0));
		arr[1]=(new Labour(350, 2000));
		arr[2]=(new Clerk(20000.0));
		
		double totalIncome= Emp.calcTotalIncome(arr);
		System.out.println("totalIncome : "+totalIncome);
		
		
	}

}
