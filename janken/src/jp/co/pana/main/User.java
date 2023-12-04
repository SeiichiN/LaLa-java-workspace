package jp.co.pana.main;

import java.util.Scanner;

public class User extends Player {
	public User(String name) {
		super(name);
	}
	
	public void setHand() {
		System.out.println("0:グー 1:チョキ 2:パー 9:終");
		this.hand = new Scanner(System.in).nextInt();
	}
}
