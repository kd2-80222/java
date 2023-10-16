package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		this("",0,"");
	}
	
	public Fruit(String colour, double weight, String name ) {
		
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public  String taste()
	{
		return "no specific taste";
	}
	
	
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter following data :");
		System.out.println("Enter colour");
		this.colour=sc.next();
		System.out.println("Enter Weight");
		this.weight=sc.nextDouble();
		System.out.println("Enter Name");
		this.name=sc.next();
		this.isFresh=true;
	}
	
	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public boolean isFresh()
	{
		if(isFresh)
			return true;
		else 
			return false;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	

}
