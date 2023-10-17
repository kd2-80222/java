/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.*/

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double num1,num2;
		boolean b1, b2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for Num1: ");
		b1 = sc.hasNextDouble();
		if (!b1)
		{
			System.out.println("Wrong Input!!!");
			System.exit(0);
		}
		num1=sc.nextDouble();
		
		System.out.println("Enter the value for Num2: ");
		b2 = sc.hasNextDouble();
		if(!b2)
		{
			System.out.println("Wrong Input!!!");
			System.exit(0);
		}
		num2=sc.nextDouble();
		System.out.println("Average is: "+(num1+num2)/2);
	}

}