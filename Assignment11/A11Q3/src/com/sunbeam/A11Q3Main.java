/*
 3. In above assignment use TreeSet instead of LinkedHashSet.
 Use natural ordering for the Book. 
 If any book with duplicate isbn is added, what will happen?
 Books are stored in which order?
 */

//		Duplicates not allowed

//		o/p Oreder = sorted. 

package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A11Q3Main {
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<>();
		
		set.add(new Book("1",100,"a1",5));
		set.add(new Book("5",200,"a5",9));
		set.add(new Book("1",600,"a3",8));
		set.add(new Book("4",500,"a4",3));
		set.add(new Book("9",200,"a2",6));
		
		Iterator<Book> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Book b= itr.next();
			System.out.println(b);
		}
	}

}
