package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String colour, double weight, String name) {
		super(colour, weight, name);
		
	}
	public Apple() {
		this("",0,"");
	}
	
	public  String taste()
	{
		return "sweet and sour";
	}
	
	public void accept()
	{
		super.accept();
	}

}
