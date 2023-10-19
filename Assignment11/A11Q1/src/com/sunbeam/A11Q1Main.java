/*Store few books (hardcoded values with the Book class in 
 *previous assignment) in a HashSet and display them using 
 *iterator. If any book with duplicate isbn is added, what will
 *happen? Books are stored in which order? 
 *Solve duplicate ISBN problem. */

/*	1.when we dont implement equals mentod and then duplicate 
*	values inserted they get inserted into set.
	Book [isbn=1, price=200.0, authorname=a2, quantity=6]
	Book [isbn=1, price=100.0, authorname=a1, quantity=5]
	Book [isbn=4, price=500.0, authorname=a4, quantity=3]
	Book [isbn=5, price=200.0, authorname=a5, quantity=9]
	Book [isbn=3, price=600.0, authorname=a3, quantity=8]
*/

//		After writing equals metnod


//		still duplictaes added

//		AFTER hashCode added

//		no duplicateds added

package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A11Q1Main {
	
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		
		set.add(new Book("1",100,"a1",5));
		set.add(new Book("5",200,"a5",9));
		set.add(new Book("1",600,"a3",8));
		set.add(new Book("4",500,"a4",3));
		set.add(new Book("9",200,"a2",6));
		// order in optupt = based on hashcode of element
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book b= itr.next();
			System.out.println(b);
		}
		
		
	}

}
