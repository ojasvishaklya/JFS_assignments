package com.telstra;

public class Account {

	protected static int id;
	protected int balance;
	protected String password;

	public Account(int balance, String password) {
		super();
		Account.id = Account.id+1;
		this.balance = balance;
		this.password=password;
	}

	public static int getId() {
		return id;
	}

	public String deposit(int amount) {
		this.balance+=amount;
		return "Successfully added " + amount+" to your account";
	}

	public String withdraw(int amount, String password) {
		if(this.password!=password) {
			return "Incorrect password can't withdraw money";
		}
		if(this.balance-amount<=0) {
			return "You only have "+this.balance+" in your account";
		}
		this.balance-=amount;
		return "Successfully withdrawn " + amount+" from your account current balance: "+this.balance;
	}


}
