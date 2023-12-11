package rpg;

import java.util.Scanner;

public class Select {
	String name;
	Character user;
	Scanner scan = new Scanner(System.in);
	Judge god = new Judge();
	
	public void select() throws Exception {
	System.out.println("『ようこそ、なんちゃってRPGの世界へ！』");
	System.out.println("『まずはあなたのお名前を教えてください。』");
	String name = scan.next();
	this.name = name;
	System.out.println("『初めまして" + name + "さん！』");
	System.out.println("『それでは" + name + "さんの職業を選んでください』");
	System.out.println("【Hボタン → HERO】【Wボタン → WIZARD】");
	String job = scan.next();
	
	switch (job) {
	
	case "h":
		Hero h = new Hero(this.name);
		this.user = h;
		break;
		
	case "w":
		Wizard w = new Wizard(this.name);
		this.user = w;
		break;
		}
	System.out.println("『それでは冒険を開始します』");
	Thread.sleep(3000L);
	god.judgement(user);
	
	}

}
