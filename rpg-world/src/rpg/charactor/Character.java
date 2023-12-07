package rpg.charactor;

import rpg.monster.Matango;

public abstract class Character {
	private String name;
	private int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Matango m);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
