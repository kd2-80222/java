/*
 Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */

import java.util.*;
public class drivingcost {
	private
	int totalmiles;
	int gasoline_cost;
	int avgmiles_Pergallon;
	int parkinf_fees;
	int tolls_Perday;
	
	
	public drivingcost() {
		
		
	}
	public drivingcost(int totalmiles, int gasoline_cost, int avgmiles_Pergallon, int parkinf_fees, int tolls_Perday) {
		super();
		this.totalmiles = totalmiles;
		this.gasoline_cost = gasoline_cost;
		this.avgmiles_Pergallon = avgmiles_Pergallon;
		this.parkinf_fees = parkinf_fees;
		this.tolls_Perday = tolls_Perday;
	}
	void accpet()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter following information ");
		System.out.println("Total miles per day ");
		totalmiles = sc.nextInt();
		System.out.println("Cost per gallon of gasoline ");
		gasoline_cost=sc.nextInt();
		System.out.println("Avarage miles per gallon ");
		avgmiles_Pergallon=sc.nextInt();
		System.out.println("Parking fees per day ");
		parkinf_fees=sc.nextInt();
		System.out.println("Tolls per day ");
		tolls_Perday=sc.nextInt();
		
		sc.close();
		
	}
	
	void driving_cost()
	{
		int cost=0;
		cost=((gasoline_cost/avgmiles_Pergallon)*totalmiles)+parkinf_fees+tolls_Perday;
		System.out.println("Total driving cost is :"+cost);
	}
	

	

	public static void main(String[] args) {
		
		drivingcost d1 = new drivingcost();
		d1.accpet();
		d1.driving_cost();
		

	}

}
