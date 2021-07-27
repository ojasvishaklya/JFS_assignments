package com.telstra;

public class User {

	protected Account ac;
	protected String name;
	
	public User(int balance, String name, String password) {
		super();
		this.ac = new Account(balance,password);
		this.name = name;
		
	}

}
