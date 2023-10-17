/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice 
for an item sold at the store. An Invoice should include four pieces of information as
fields—a part number (type String), a part description (type String), a quantity of the 
item being purchased (type int) and a price per item (double). Your class should have a
constructor that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the quantity by 
the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

package invoice;

import java.util.Scanner;

public class Invoice {
	private String partNo;
	private String partDesc;
	private int qty;
	private double price;

	public Invoice(String partNo, String partDesc, int qty, double price) {
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.qty = qty;
		this.price = price;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty > 0)
			this.qty = qty;
		else
			this.qty = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 0.0;
	}

	public double invoiceAmount() {
		return qty * price;
	}

	public void acceptInvoice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************************");
		System.out.print("Enter the part number: ");
		this.partNo = sc.next();
		System.out.print("Enter the part description: ");
		this.partDesc = sc.next();
		System.out.print("Enter the part quantity: ");
		this.qty = sc.nextInt();
		if (qty > 0)
			this.qty=qty;
		else
			this.qty = 0;
		System.out.print("Enter the part price: ");
		this.price = sc.nextDouble();
		if (price > 0)
			this.price=price;
		else
			this.price = 0.0;
	}

	public void displayInvoice() {
		System.out.println("**************************************");
		System.out.println("The Invoice Details are: ");
		System.out.println("The part number is: " + partNo);
		System.out.println("The part description is: " + partDesc);
		System.out.println("The part quantity is: " + qty);
		System.out.println("The part price is: " + price);
		System.out.println("The total amount is: " + invoiceAmount());
	}

}