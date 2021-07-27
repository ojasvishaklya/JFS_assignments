package com.telstra;

public class Stadium {

	public static void main(String[] args) {

		Player p1=new Player();
		Player p2=new Player();

		int s1=p1.play();
		int s2=p2.play();

		System.out.println("Player 1 score :"+s1);
		System.out.println("Player 2 score :"+s2);

		int diff =s1-s2;

		if(diff>0) {
			System.out.println("Player 1 wins by "+diff+" points");
		}else if(diff==0) {
			System.out.println("its a draw");	
		}else {
			diff*=-1;
			System.out.println("Player 2 wins by "+diff+" points");	
		}
	}
}
