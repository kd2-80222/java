package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class A11Q5 {
	
	public static void main(String[] args) {
		Map<String,Book> map = new HashMap<>();
		
		int choice;
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add book");
			System.out.println("2.Search book");
			System.out.println("3.Display books");
			System.out.println("Enter choice");
			Scanner sc= new Scanner(System.in);
			choice= sc.nextInt();
			switch (choice) {
			case 1:
				Book b=new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				
				break;
			case 2:
				System.out.println("Enter Isbn to search book");
				String isbn1= sc.next();
				Book f = map.get(isbn1);
				f.display();
				break;
			case 3:
				Set<Entry<String, Book>> entries = map.entrySet();
				for(Entry<String,Book> e :entries)
					System.out.println(e.getKey() +"-->"+e.getValue());
				break;

			default:choice =0;
				break;
			}
		} while (choice !=0);
		
	}

}
