package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String colour, double weight, String name) {
		super(colour, weight, name);
		
	}
	
	public Mango() {
		this("",0,"");
	}

	public  String taste()
	{
		return "sweet ";
	}
	
	public void accept()
	{
		super.accept();
	}

}
