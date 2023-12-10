package rpg.monster;

import rpg.character.Character;

public abstract class Monster {
	private int hp;
	private String type;
	private int damage;
	
	public Monster(String type, int hp, int damage) {
		this.type = type;
		this.hp = hp;
		this.damage = damage;
	}
	
	public Monster(String type) {
		this(type, 80, 10);
	}
	
	abstract public void attack(Character c);

	public int getHp() {
		return hp;
	}

	public String getType() {
		return type;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return type + " hp:" + hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
