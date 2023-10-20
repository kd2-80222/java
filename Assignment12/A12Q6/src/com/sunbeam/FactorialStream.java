package com.sunbeam;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class FactorialStream {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number for factrial calculations : ");
		int num = sc.nextInt();
		Stream<Integer> strm = Stream.iterate(1, x->x+1).limit(num).distinct();
		int result = strm.reduce(1, (a,b)->a*b);
		System.out.println("Factorial is : "+result);
		
	}

}
