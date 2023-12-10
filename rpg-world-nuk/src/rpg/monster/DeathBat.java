package rpg.monster;

import rpg.character.Character;
import rpg.character.Hero;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		this("地獄コーモリ", 60, 5);
	}
	public DeathBat(String type, int hp, int damage) {
		super(type, hp, damage);
	}

	public void fly() {
		System.out.println(this.getType() + "は、羽ばたいて逃げ出した");
	}
	
	@Override
	public void attack(Character c) {
		if (this.getHp() <= 0) { return; }
		System.out.println(this.getType() + "の攻撃");
		int damage = (int)(Math.random() * this.getDamage());
		System.out.println(c.getName() + "に" + damage + "のダメージ");
		c.setHp(c.getHp() - damage);
		System.out.println(c);
	}

}
