package rpg.monster;

import rpg.character.Character;
import rpg.common.Runnable;

public class Matango extends WalkingMonster implements Runnable {
	private char suffix;
	
	public Matango(char suffix) {
		super("マタンゴ", 50, 5);
		this.suffix = suffix;
	}
	
	@Override
	public void run() {
		System.out.println
		(this.getType() + this.getSuffix() + "はトコトコ走って逃げた");
	}
	@Override
	public void attack(Character c) {
		if (this.getHp() <= 0) { return; }
		System.out.println(this.getType() + this.suffix + "の攻撃");
		int damage = (int)(Math.random() * this.getDamage());
		System.out.println(c.getName() + "に" + damage + "のダメージ");
		c.setHp(c.getHp() - damage);
		System.out.println(c);
	}

	public char getSuffix() {
		return suffix;
	}

}
