package rpg.monster;

import rpg.Flyable;
import rpg.charactor.Character;

public class DeathBat extends Monster implements Flyable {
	String name;
	
	public DeathBat(String name) {
		this.name = name;
	}

	public void fly() {
		System.out.println("地獄コウモリは、羽ばたいて逃げ出した");
	}
	@Override
	void attack(Character c) {
		System.out.println("突っつく");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
