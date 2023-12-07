package rpg.monster;

import rpg.charactor.Hero;

public class Matango extends Monster {
	private char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
		super.setHp(50);
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("5のダメージ");
		h.setHp(h.getHp() - 5);
	}
}
