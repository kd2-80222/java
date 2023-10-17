/*
 Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded". 
 */

import java.util.*;
public class Creditlimit {
	
	private 
		int accno;
		int balance_month;
		int total_month;
		int total_credits_month;
		int credit_limit;
		
	public 
	
	 Creditlimit(int accno, int balance_month, int total_month, int total_credits_month, int credit_limit) {
		
		this.accno = accno;
		this.balance_month = balance_month;
		this.total_month = total_month;
		this.total_credits_month = total_credits_month;
		this.credit_limit = credit_limit;
	}
	public Creditlimit() {
		
	}
	void newBalance()
	{
		int newbalance=0;
		newbalance=(balance_month+total_month - total_credits_month);
		if(newbalance < credit_limit)
			System.out.println("Credit limit exceeded");
		else
			System.out.println("New Balance is : " + newbalance);
			
	}
	
	void accept()
	{	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter following information ");
		
		System.out.println("Account number : ");
		accno=sc.nextInt();
		System.out.println("Balance at begning of month : ");
		balance_month=sc.nextInt();
		System.out.println("Total of all items charged this month : ");
		total_month=sc.nextInt();
		System.out.println("Total of all credits applied to customers account this month : ");
		total_credits_month=sc.nextInt();
		System.out.println("Allowed credit limit : ");
		credit_limit=sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		
		Creditlimit c1=new Creditlimit();
		c1.accept();
		c1.newBalance();
		
		
		
	}

}
