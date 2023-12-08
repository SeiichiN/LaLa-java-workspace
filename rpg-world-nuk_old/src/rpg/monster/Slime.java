package rpg.monster;

import rpg.Runnable;
import rpg.charactor.Character;

public class Slime extends Monster implements Runnable {
	private String name;
	
	public Slime(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void run() {
		System.out.println("スライムは体をうねらせて逃げ出した");
	}

	@Override
	void attack(Character c) {
		System.out.println(this.getName() + "の強烈な毒ガス攻撃");
		System.out.println(c.getName() + "に5ポイントのダメージを与えた");
		c.setHp(c.getHp() - 5);
	}

	@Override
	public String toString() {
		return name;
	}
	
}
