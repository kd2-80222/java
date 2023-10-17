package invoicetest;

import invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("01", "internet", 6, 100.7);
		invoice.displayInvoice();
		invoice.acceptInvoice();
		invoice.displayInvoice();
	}

}