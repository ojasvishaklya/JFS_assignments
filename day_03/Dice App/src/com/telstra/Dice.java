package com.telstra;

public class Dice {
	
	private int value;
	
	public void roll() {
		this.value= 1+ (int)(Math.random()*7);
	}
	
	public int getValue() {
		roll();
		return this.value;
	}
}
