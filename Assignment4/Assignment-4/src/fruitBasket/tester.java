package fruitBasket;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class tester {
	
	public static void main(String[] args) {
		System.out.println("Enter the number of fruits you want : ");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		Fruit basket[]= new Fruit[num];
		int choice;
		int index;
		int counter=0;
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Name of all Fruits from Basket:");
			System.out.println("5.Fresh fruits:");
			System.out.println("6.Taste of all stale fruits");
			System.out.println("7.Mark fruit as stale");
			System.out.println("8.Mark all sour fruits as stale:");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:if(counter<num)
				{
					basket[counter]=new Mango();
					basket[counter].accept();
					counter++;
				}
				
				break;
			case 2:if(counter<num)
			{
				basket[counter]=new Orange();
				basket[counter].accept();
				counter++;
			}
			
			break;
			
			case 3:if(counter<num)
			{
				basket[counter]=new Apple();
				basket[counter].accept();
				counter++;
			}
				break;
				
			case 4:
				for(Fruit fruit : basket)
					if(fruit != null)
					{
						System.out.println(fruit.getName());
					}
				break;
			
			case 5:
				System.out.println("Enter index");
				for(Fruit fruit : basket)
				{
					if(fruit != null)
					{
						if(fruit.isFresh())
						{
							String details=fruit.toString();
							System.out.println(details);
						}
						else
							System.out.println("FRUIT  IS FRESH..");
					}
				}
				break;
				
			case 6:for (Fruit fruit : basket) {
				if (fruit.isFresh()) {

					System.out.println("ALL FRUIT  ARE  FRESH..");
					break;
				} else {
					String taste = fruit.taste();
					System.out.println(taste);
					break;
				}
			}
				break;
				
			case 7:System.out.println("Enter index to ");
			index = sc.nextInt();
			if (index > counter && counter < 0) {
				System.out.println("Invalid index....");
			} else {
				basket[index].setFresh(false);
				break;
			}
				break;
				
			case 8:for (Fruit fruit : basket) {
				if (fruit.taste() == "sour") {
					fruit.setFresh(false);
				}
			}
				break;

			
			}
			
		} while (choice != 0);
	}

}
