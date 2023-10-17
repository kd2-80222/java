/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.*/

import java.util.Scanner;

public class Foodmenu {

	public static void main(String[] args) {
		int choice = 0, qty, price, totalBill;
		int totalVadapav = 0, totalSamosa = 0, totalDosa = 0, totalIdli = 0, totalShevpuri = 0;

		Scanner sc = new Scanner(System.in);

		while (choice < 7) {
			System.out.println("0.exit");
			System.out.println("1.Vadapav");
			System.out.println("2.Samosa");
			System.out.println("3.Dosa");
			System.out.println("4.Idli");
			System.out.println("5.Shevpuri");
			System.out.println("6.Generate Bill");
			System.out.print("What you wish to eat? ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.print("Enter the quantity of Vadapav: ");
				qty = sc.nextInt();
				price = 15;
				totalVadapav += qty * price;
				System.out.println("Total bill for Vadapav: " + totalVadapav);
				break;
			case 2:
				System.out.print("Enter the quantity of Samosa: ");
				qty = sc.nextInt();
				price = 15;
				totalSamosa += qty * price;
				System.out.println("Total bill for Samosa: " + totalSamosa);
				break;
			case 3:
				System.out.print("Enter the quantity of Dosa: ");
				qty = sc.nextInt();
				price = 30;
				totalDosa += qty * price;
				System.out.println("Total bill for Dosa: " + totalDosa);
				break;
			case 4:
				System.out.print("Enter the quantity of Idli: ");
				qty = sc.nextInt();
				price = 20;
				totalIdli += qty * price;
				System.out.println("Total bill for Idli: " + totalIdli);
				break;
			case 5:
				System.out.print("Enter the quantity of Shevpuri: ");
				qty = sc.nextInt();
				price = 25;
				totalShevpuri += qty * price;
				System.out.println("Total bill for Shevpuri: " + totalShevpuri);
				break;
			case 6:
				totalBill = totalVadapav + totalSamosa + totalDosa + totalIdli + totalShevpuri;
				System.out.println("Total Bill is: " + totalBill);
				break;
			default:
				System.out.println("Not available in menu");
				break;

			}
		}

	}
}