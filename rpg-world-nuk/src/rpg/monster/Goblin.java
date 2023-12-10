package rpg.monster;

import rpg.character.Character;
import rpg.common.Runnable;

public class Goblin extends WalkingMonster implements Runnable {
	private int damage;
	
	public Goblin() {
		super("ゴブリン");
		this.damage = 10;
	}

	@Override
	public void attack(Character c) {
		if (this.getHp() <= 0) { return; }
		System.out.println(this.getType() + "の攻撃");
		int damage = (int) (Math.random() * this.getDamage());
		System.out.println(c.getName() + "に" + damage + "のダメージ");
		c.setHp(c.getHp() - damage);
		System.out.println(c);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
