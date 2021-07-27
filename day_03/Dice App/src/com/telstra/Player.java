package com.telstra;

public class Player {
	
	private Dice d1;
	
	public Player() {
		d1=new Dice();
	}	
	public int play() {
		return d1.getValue();
	}
}
