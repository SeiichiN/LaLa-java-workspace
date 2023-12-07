package rpg.monster;

import rpg.charactor.Character;
import rpg.Runnable;

public class Matango extends Monster implements Runnable {
	private char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
		super.setHp(50);
	}

	@Override
	public void attack(Character c) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("5のダメージ");
		c.setHp(c.getHp() - 5);
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
}
