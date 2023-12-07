package rpg.charactor;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Hero extends Character {
	
	public final void slip() {
		setHp(getHp() - 5);
		System.out.println(this.getName() + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	public void attack(Monster m) {
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
		    (this.getName() + "の " + mm.suffix + "への攻撃");
		}
		m.setHp(m.getHp() - 5);
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.getName() + "は逃げ出した");
	}

	@Override
	public void attack(Matango m) {
		attack(m);
		
	}

}
