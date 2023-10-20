package com.sunbeam;

import java.util.stream.IntStream;

public class StreamInt {
	
	public static void main(String[] args) {
		
		IntStream str1 = IntStream.range(1, 10);
		int total = str1.sum();
		System.out.println("Sum = "+total);

		IntStream str2 = IntStream.range(1, 10);
		
		System.out.println( str2.summaryStatistics());
	
	}

}
