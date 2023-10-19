/*2. In above assignment use LinkedHashSet instead of HashSet.
If any book with duplicate isbn is added, what will happen? 
Books are stored in which order? */

/*	
 	o/p order = based on insertion of elements
 	
 	here we have already added equals() and hashcode() so no 
 	duplicates are allowed
*/


package com.sunbeam;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class A11Q2Main {
	
	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<>();
		
		set.add(new Book("1",100,"a1",5));
		set.add(new Book("5",200,"a5",9));
		set.add(new Book("1",600,"a3",8));
		set.add(new Book("4",500,"a4",3));
		set.add(new Book("9",200,"a2",6));
		// order in optupt = based on insertion of element
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book b= itr.next();
			System.out.println(b);
		}
		
		
	}

}
