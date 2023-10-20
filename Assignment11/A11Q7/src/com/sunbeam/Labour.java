package com.sunbeam;

public class Labour implements Emp {
	private int hours;
	double rate;
	
	public  Labour() {
		
	}
	@Override
	public double getsal() {
		 
		return this.hours*this.rate;
	}
	
	public double calcIncentives() 
	{
		if(this.hours > 300)
			return this.getsal()*0.5;	
		else 
			return 0.0;
	}

	public Labour(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	
	

}
