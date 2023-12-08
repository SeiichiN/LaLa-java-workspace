package rpg.monster;

import rpg.Runnable;
import rpg.charactor.Character;

public class Goblin extends Monster implements Runnable {
	String name;
	
	public Goblin() {}
	public Goblin(String name) {
		this.name = name;
	}

	public void attack(Character c) {
		System.out.println("ナイフで斬りつける");
		System.out.println(c.getName() + "に5ポイントのダメージ");
		c.setHp(c.getHp() - 5);
	}

	@Override
	public String toString() {
		return name;
	}

}
