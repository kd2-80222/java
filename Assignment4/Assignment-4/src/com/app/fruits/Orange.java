package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String colour, double weight, String name) {
		super(colour, weight, name);
		
	}
	public Orange() {
		this("",0,"");
	}
	
	public  String taste()
	{
		return " sour";
	}
	
	public void accept()
	{
		super.accept();
	}
}
