package rpg.monster;

import rpg.charactor.Character;

public abstract class Monster {
	private int hp;
	private String type;
	
	public Monster() {
		this.hp = 100;
		this.type = "monster";
	}
	public Monster(String type) {
		this.type = type;
		this.hp = 100;
	}
	
	abstract void attack(Character c);

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return type;
	}
}
