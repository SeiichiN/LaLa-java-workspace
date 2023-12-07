package rpg;

import rpg.monster.Matango;

public class Thief extends Character {
	int mp;
	
	public Thief() {
		
	}
	
	public Thief(String name, int hp, int mp) {
		super.name = name;
		super.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40, 5);
	}

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println
		    (m.suffix + "に5ポイントのダメージ");
		
	}

}
