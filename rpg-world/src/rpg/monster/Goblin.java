package rpg.monster;

import rpg.Runnable;
import rpg.character.Character;

public class Goblin extends WalkingMonster implements Runnable {
	
	public Goblin() {
		super("ゴブリン");
	}

	@Override
	public void attack(Character c) {
		System.out.println(this.getType() + "の攻撃");
		System.out.println(c.getName() + "に10のダメージ");
		c.setHp(c.getHp() - 10);		
	}

}
