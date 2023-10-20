package com.sunbeam;

public interface Emp {
	// 1
	double getsal();
	
	// 2
	default double calcIncentives() {
		return 0.0;
	}
	// 3
	static double calcTotalIncome(Emp[] arr)
	{
		double total=0.0;
		for(Emp ele : arr)
		{
			total += ele.getsal() + ele.calcIncentives();
		}
		return total;
	}
	
}
