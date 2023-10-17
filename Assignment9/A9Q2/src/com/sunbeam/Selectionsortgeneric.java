package com.sunbeam;

import java.util.Comparator;

public class Selectionsortgeneric {
	
	static <T> void selectionsort(T[] arr, Comparator<T> c)
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j < arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0)
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		class Sortcomprator implements Comparator<Double>
		{	@Override
			public int compare(Double a, Double b) {	// line 12 is colling it so a= arr[i] , b=arr[j]
//				if(a > b)
//					return 1;		this is working 
//				return 0;
			return Double.compare(a, b);
			}
		}
		
		Double[] arr1= {1.2,2.3,3.4,4.5,0.3};
		System.out.println("Before Sorting");
		for(Double ele : arr1)
		{
			System.out.println(ele);
		}
		
		Sortcomprator comprator = new Sortcomprator();	// created object of comprator interface
		
		selectionsort(arr1, comprator);	//calling method and arr is getting sorted in arr1 itself
		
		System.out.println("After Sorting");
		
		for(Double ele : arr1)
		{
			System.out.println(ele);
		}
		

	}

}
