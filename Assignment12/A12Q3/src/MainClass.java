import java.util.Scanner;

public class MainClass {
	
	public static void calculate(double num1, double num2, Arithematic op)
	{
		double result = op.calc(num1, num2);
		System.out.println("Result = " + result );
	}
	
	public static void main(String[] args) {
		
		int choice=0;
		do 
		{
			System.out.println("0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			System.out.println("Enter Choice");
			Scanner sc= new Scanner(System.in);
			choice=sc.nextInt();
			System.out.print("Enter Number 1 ");
			int num1 = sc.nextInt();
			System.out.print("Enter Number 2 ");
			int num2 = sc.nextInt();
			switch (choice) {
			case 1:
				calculate(num1, num2, (x,y) -> x+y);
				
				break;
			case 2:		
				calculate(num1, num2, (x,y) -> x-y);
				
				break;
			case 3:
				calculate(num1, num2, (x,y) -> x*y);
				
				break;
			case 4:
				calculate(num1, num2, (x,y) -> x/y);
				
				break;

			default:
				break;
			}
			
			
			
		} while (choice !=0 );
	}

}
