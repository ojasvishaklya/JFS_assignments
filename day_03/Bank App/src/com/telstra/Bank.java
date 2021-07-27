package com.telstra;

public class Bank {

	public static void main(String[] args) {
		
		User user=new User(1000,"Ojasvi","zxc");
		
		System.out.println(user.ac.deposit(500));
		System.out.println(user.ac.withdraw(800,"zxc"));
		System.out.println(user.ac.deposit(500));
		System.out.println(user.ac.withdraw(1000,"abc"));
		System.out.println(user.ac.withdraw(1300,"zxc"));

	}

}
