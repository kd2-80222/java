package com.sunbeam.main;
import com.sunbeam.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) {
		int choice;
		int index;
		String isbn1;
		
		List<Book> list = new ArrayList<>();	// just created list
		
		do {
			System.out.println("***************** MENU *********************");
			System.out.println("0.EXIT");
			System.out.println("1.Add new Book");
			System.out.println("2.Display all books in forward order");
			System.out.println("3.Delete book at given index");
			System.out.println("4.check book of isbn");
			System.out.println("5.Delete all books in list");
			System.out.println("6.Display number of books in list");
			System.out.println("7.Sort all books by Price in desc order");
			System.out.println("********************************************");

			System.out.println("Enter your choice");
			
			Scanner sc= new Scanner(System.in);
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				{
					Book b = new Book();
					b.accept();
					list.add(b);
					System.out.println("Congrats... you added a new book");
				}
				
				break;
			case 2:
				{
					if(list.size() == 0)
						System.out.println("List is empty.");
					else
					{for (Book ele : list)
						ele.display();
					System.out.println();}
				}
				break;
			case 3:
				{
					System.out.println("Enter index for deletion : ");
					index=sc.nextInt();
					if(index < 0 || index > (list.size()-1))
						System.out.println("wrong index");
					else
					 {list.remove(index);
					System.out.println("you deleted the book.");}
				}
				break;
			case 4:
				{
					System.out.println("Enter isbn to search :");
					isbn1=sc.next();
					Book key = new Book();
					key.setIsbn(isbn1);
					//key.display();
					if(list.contains(key))
						System.out.println("Book is present in list");
					else
						System.out.println("Book is not present in list");
				}
				break;
			case 5:
				{
					list.clear();
					System.out.println("Deleted all books from list");
				}
				break;
			case 6:
				{
					System.out.println("Total books in list : "+list.size());
				}
				break;
			case 7:
				
					class BookPriceComprator implements Comparator<Book>
					{
					@Override
					public int compare(Book b1, Book b2) {
						int diff =  - Double.compare(b1.getPrice(), b2.getPrice());	// for desc order - sign is used
						return diff;
					}
					
					}
					BookPriceComprator c = new BookPriceComprator();
					list.sort(c);
					
					{for (Book ele : list)
						ele.display();
					System.out.println();}

				
				break;

			default:
				break;
			}
			
			
		} while (choice != 0);

	}

}
