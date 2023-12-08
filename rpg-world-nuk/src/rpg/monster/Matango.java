package rpg.monster;

import rpg.Runnable;
import rpg.character.Character;

public class Matango extends WalkingMonster implements Runnable {
	private char suffix;
	
	public Matango(char suffix) {
		super("マタンゴ", 50);
		this.suffix = suffix;
	}
	
	@Override
	public void run() {
		System.out.println
		(this.getType() + this.getSuffix() + "はトコトコ走って逃げる");
	}
	@Override
	public void attack(Character c) {
		System.out.println(this.getType() + this.suffix + "の攻撃");
		System.out.println(c.getName() + "に5のダメージ");
		c.setHp(c.getHp() - 5);
		System.out.println(c);
	}

	public char getSuffix() {
		return suffix;
	}
}
