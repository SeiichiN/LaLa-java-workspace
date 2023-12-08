package rpg.charactor;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Thief extends Character {
	private int mp;

	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40, 5);
	}
	
	public Thief(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃");
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
				(mm.getSuffix() + "に5ポイントのダメージ");
		} else {
			System.out.println
			(m.getType() + "に5ポイントのダメージ");
		}
	}
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
