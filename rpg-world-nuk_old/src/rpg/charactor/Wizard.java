package rpg.charactor;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Wizard extends Character {
	int mp;

	public Wizard(String name) {
		super(name, 100);
	}
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.setMp(mp);
	}

	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	@Override
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println("敵に3ポイントのダメージ");
		m.setHp(m.getHp() - 5);
	}
	
	public void fireball(Monster m) {
		System.out.println(this.getName() + "は火の玉を放った!");
		System.out.println("敵に20ポイントのダメージ");
		m.setHp(m.getHp() - 20);
		this.mp -= 5;
	}

}
