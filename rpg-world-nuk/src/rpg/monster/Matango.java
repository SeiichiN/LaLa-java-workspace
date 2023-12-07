package rpg.monster;

import rpg.Hero;
import rpg.Monster;

public class Matango extends Monster {
	public int hp = 50;
	public char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("5のダメージ");
		h.hp -= 5;
	}
}
