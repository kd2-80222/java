package com.sunbeam.main;
import com.sunbeam.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestreMain {

	public static void main(String[] args) {
		int choice;
		int index;
		String isbn1;
		String isbn2;
		
		List<Book> list = new ArrayList<>();	// just created list
		
		do {
			System.out.println("***************** MENU *********************");
			System.out.println("0.EXIT");
			System.out.println("1.Add new Book");
			System.out.println("2.Display all books in forward order using random access");
			System.out.println("3.Search a book with given isbn");
			System.out.println("4.Delete book at given index");
			System.out.println("5.Delete books with given isbn");
			System.out.println("6.Reverse the list");
			System.out.println("********************************************");

			System.out.println("Enter your choice");
			
			Scanner sc= new Scanner(System.in);
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				{
					Book b = new Book();
					b.accept();
					if(list.contains(b))
					{
						System.out.println("Book already present in list");
						int index1 = list.indexOf(b);
						System.out.println("Enter quantity");
						int qty = sc.nextInt();
						b.setQuantity(b.getQuantity()+qty);
						System.out.println("Congrats Book quantity updated");
						
					}
					else
					{
					list.add(b);
					System.out.println("Congrats... you added a new book");
					}
				}
				break;
			case 2:
				{
					for(int i=0 ; i< list.size(); i++)
						list.get(i).display();
				}
				break;
			case 3:
				System.out.println("Enter isbn to search book:");
				isbn2=sc.next();
				Book key2=new Book();
				key2.setIsbn(isbn2);
				if(!(list.indexOf(key2) == -1))
					System.out.println("Book is present");
				else
					System.out.println("Book is not present");
					
				
				break;
			case 4:
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
			case 5:
				{
					System.out.println("Enter isbn to delete book:");
					isbn1=sc.next();
					Book key=new Book();
					key.setIsbn(isbn1);
					if(list.contains(key))
					{	list.remove(key);
					System.out.println("Deleted book from list");}
					else
						System.out.println("Book is not in list");
					
				}
				break;
			case 6:
				{
					//List<Book> listReverse = new <Book>();
						//listReverse  =	
					Collections.reverse(list);
						System.out.println("List in reverse order ");
						{for (Book ele : list)
							ele.display();
						System.out.println();}
						
				}
				break;
			

			default:
				break;
			}
			
			
		} while (choice != 0);

	}

}
