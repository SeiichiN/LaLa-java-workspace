package rpg.character;

import rpg.Player;
import rpg.Runnable;
import rpg.monster.Monster;

public abstract class Character extends Player implements Runnable {
	private String name;
	private int hp;
	
	public Character(String name) {
		this(name, 100);
	}
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	@Override
	public void run() {
		System.out.println
		(this.getName() + "は走って逃げた");
	}
	
	public abstract void attack(Monster m);
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return name + " hp:" + hp;
	}

}
