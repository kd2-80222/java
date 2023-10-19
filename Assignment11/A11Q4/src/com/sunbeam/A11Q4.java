package com.sunbeam;
import java.util.NavigableSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A11Q4 {
	public static void main(String[] args) {
		
		
		class BookPriceComprator implements Comparator<Book>
			{
			@Override
			public int compare(Book b1, Book b2) {
				int diff =  - Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
				}
			}
		
		BookPriceComprator cmp= new BookPriceComprator();
		
		Set<Book> set = new TreeSet<>(cmp);
		
		set.add(new Book("1",100,"a1",5));
		set.add(new Book("5",700,"a5",9));
		set.add(new Book("1",500,"a3",8));
		set.add(new Book("4",500,"a4",3));
		set.add(new Book("9",200,"a2",6));
		
		Iterator<Book> itr=set.iterator();
		while(itr.hasNext())
		{
			Book b= itr.next();
			System.out.println(b);
	
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		
		TreeSet<Book> tset = new TreeSet<>();
		tset.add(new Book("1",100,"a1",5));
		tset.add(new Book("5",200,"a5",9));
		tset.add(new Book("1",600,"a3",8));
		tset.add(new Book("4",500,"a4",3));
		tset.add(new Book("9",200,"a2",6));
		
		Iterator<Book> itr1 = tset.descendingIterator();
		while(itr1.hasNext())
		{
			Book b= itr1.next();
			System.out.println(b);
		}
				
		
				
		
		
	}
}
