package com.sunbeam;

public class A12Q4Class {
	public static <t> void countIf(t[] arr , t key, check<t> c)
	{
		int result = 0;
		for (t ele : arr)
		{
			if(c.compare(ele, key))
				result++;
		}
		System.out.println("Result = "+ result);
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Integer key = 50;
		
		countIf(arr, key, (x,y)-> x > y);
	}

}
