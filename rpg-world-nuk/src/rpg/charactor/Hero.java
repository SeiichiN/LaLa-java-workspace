package rpg.charactor;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Hero extends Character {
	
	public Hero() {
		this("ミナト", 100);
	}
	
	public Hero(String name) {
		this(name, 100);
	}
	
	public Hero(String name, int hp) {
		super(name, hp);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public final void slip() {
		setHp(getHp() - 5);
		System.out.println(this.getName() + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	@Override
	public void attack(Monster m) {
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
		    (this.getName() + "の " + mm.getSuffix() + "への攻撃");
		}
		m.setHp(m.getHp() - 5);
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.getName() + "は逃げ出した");
	}

	public void attack(Matango m) {
		attack(m);
		
	}

}
