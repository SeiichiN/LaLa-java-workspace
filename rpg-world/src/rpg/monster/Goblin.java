package rpg.monster;

import rpg.charactor.Hero;

public class Goblin extends WalkingMonster {
	String name;
	
	public Goblin() {}
	public Goblin(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("ゴブリンは、腕をふって逃げ出した");
	}
	public void attack(Hero h) {
		System.out.println("ナイフで斬りつける");
	}

}
