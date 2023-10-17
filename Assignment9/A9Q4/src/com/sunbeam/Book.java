package com.sunbeam;

import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorname;
	private int quantity;
	
	public Book() {
		
	}

	public Book(String isbn, double price, String authorname, int quantity) {
		super();
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
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn: ");
		this.isbn=sc.next();
		System.out.println("Enter Price : ");
		this.price=sc.nextInt();
		System.out.println("Enter AuthorName: ");
		this.authorname=sc.next();
		System.out.println("Enter Quantity: ");
		this.quantity=sc.nextInt();
	}
	public void display()
	{
		System.out.println(" Book Details");
		System.out.println("ISBN :" +isbn);
		System.out.println("Price :" +price);
		System.out.println("Anthor Name :" +authorname);
		System.out.println("Quantity :" +quantity);
		
		System.out.println();
		
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book) {
			Book other = (Book) obj;
			if(this.isbn.equals(other.isbn))
				return true;
		}
		return false;
		
		
	}
	

}
