package rpg.charactor;

import rpg.Player;
import rpg.monster.Monster;

public abstract class Character extends Player {
	private String name;
	private int hp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Monster m);
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
