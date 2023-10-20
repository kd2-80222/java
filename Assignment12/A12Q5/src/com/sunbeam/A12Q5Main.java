package com.sunbeam;

import java.util.Scanner;

public class A12Q5Main {
	
	public static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int result=0;
		for(T ele: arr)
		{
			if(c.compare(ele, key))
				result++;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Double [] arr = {1.1, 2.2, 1.1, 4.4, 5.5, 4.4, 5.5, };
		double key1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Key : ");
		key1=sc.nextDouble();
		int count = countIf(arr, key1, (x,y)-> x.equals(y));	// x == y does not work as t generic work with referenses
																// and refrences cant be equal
		System.out.println("Count of elements same as key = "+count);
	}
}
