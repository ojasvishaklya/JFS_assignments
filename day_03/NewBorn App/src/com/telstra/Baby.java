package com.telstra;

public class Baby {
	protected String name;
	protected double height;
	protected double weight;
	protected String healthStatus;
	public Baby(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setStatus() {
		double bmi= this.weight/(height*height);
		
		if(bmi<18) {
			this.healthStatus="Under Nourished";
		}else if(bmi>=28){
			this.healthStatus="Over Nourished";	
		}else this.healthStatus="Healthy";
	}
	
	@Override
	public String toString() {
		this.setStatus();
		return "Baby [name=" + name + ", height=" + height + ", weight=" + weight + ", healthStatus=" + healthStatus
				+ "]";
	}
	
}
