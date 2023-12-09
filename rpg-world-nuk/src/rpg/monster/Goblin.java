package rpg.monster;

import rpg.character.Character;
import rpg.common.Runnable;

public class Goblin extends WalkingMonster implements Runnable {
	
	public Goblin() {
		super("ゴブリン");
	}

	@Override
	public void attack(Character c) {
		if (this.getHp() <= 0) { return; }
		System.out.println(this.getType() + "の攻撃");
		System.out.println(c.getName() + "に10のダメージ");
		c.setHp(c.getHp() - 10);
		System.out.println(c);
	}

}
