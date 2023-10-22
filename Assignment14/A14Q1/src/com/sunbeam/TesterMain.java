package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit.");
			System.out.println("1.Add new Candidate.");
			System.out.println("2.Update Candidate.");
			System.out.println("3.Get partywise total votes.");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try(CandidateDAO dao = new CandidateDAO())
			{
				
				System.out.println("Enter name ");
				String name=sc.next();
				System.out.println("Enter Party ");
				String party=sc.next();
				System.out.println("Enter Votes ");
				int votes=sc.nextInt();
				Candidate c = new Candidate(0,name,party,votes);
				int count = dao.save(c);
				System.out.println("Candidate added to database"+count);
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				break;
			case 2:
				try(CandidateDAO dao = new CandidateDAO())
				{
				System.out.println("Enter id ");
				int id=sc.nextInt();
				
				System.out.println("Enter name ");
				String name=sc.next();
				System.out.println("Enter Party ");
				String party=sc.next();
				
				Candidate c = new Candidate(id,name,party,0);
				int count = dao.update(c);
				System.out.println("Candidate Updated to database"+count);
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				break;
			case 3:
				try(CandidateDAO dao = new CandidateDAO())
				{
				List<PartyVotes> list = dao.getPartywiseVotes();
				list.forEach(c -> System.out.println(c));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
			
		} while (choice !=0);
		
		System.out.println("ThankYou.......");
		
		
		

	}

}
