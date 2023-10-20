package com.sunbeam;

import java.util.function.Predicate;

public class LengthofStringCount {
	
	public static int countIf(String[] arr, Predicate<String> cond)
	{
		int count = 0;
		for(String str : arr)
		{
			if(cond.test(str))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String[] arr= { "Nilesh", "Shubham","Pratik","Omkar","Prashant"};
//		int count = countIf(arr, new Predicate<String>(){
//
//			@Override
//			public boolean test(String s) {
//				return s.length() > 6;
//			}
//			
//		});
		
		int count = countIf(arr, x -> x.length() > 6);
		System.out.println("Result = " + count);
	}

}
