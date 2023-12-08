package rpg.monster;

import rpg.character.Character;

public abstract class Monster {
	private int hp;
	private String type;
	
	public Monster(String type, int hp) {
		this.type = type;
		this.hp = hp;
	}
	
	public Monster(String type) {
		this(type, 80);
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
}
