package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Testermain {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0]=new Student(1,"OM","MUMBAI",102.2);
		arr[1]=new Student(2,"S2","PUNE",108.9);
		arr[2]=new Student(3,"S3","PUNE",108.7);
		arr[3]=new Student(4,"S4","DELHI",104.1);
		arr[4]=new Student(5,"S5","GOA",112.3);
		
		System.out.println("Before Sorting");
		for(Student ele : arr)
			System.out.println(ele);
		
		// Arrays.sort(arr);	giving error
		
		class StudentComprator implements Comparator<Student>
		{	@Override
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());// Descending
				if(diff == 0)
					 diff= - (Double.compare(s1.getMarks(), s2.getMarks()));
				if(diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		
		StudentComprator comprator = new StudentComprator();
		Arrays.sort(arr, comprator);
		System.out.println("After Sorting");
		for(Student ele : arr)
			System.out.println(ele);

	}

}
