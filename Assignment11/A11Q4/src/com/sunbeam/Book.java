package com.sunbeam;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
	private String isbn;
	private double price;
	private String authorname;
	private int quantity;
	
	public Book() {
		
	}

	public Book(String isbn, double price, String authorname, int quantity) {
		
		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return authorname;
	}

	public void setName(String authorname) {
		this.authorname = authorname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}

	

	@Override
	public int compareTo(Book b) {
		int diff = this.isbn.compareTo(b.isbn);
		return diff;
	}
//	
//	@Override
//	public int hashCode()
//	{
//		int hash = Objects.hash(this.isbn);
//		return hash;
//	}
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(obj == null)
//			return false;
//		if(this == obj)
//			return true;
//		if(obj instanceof Book) {
//			Book b = (Book)obj;
//			if(this.isbn.equals(b.isbn));
//				return true;
//		}
//		return false;
//	}

	
	
	

}