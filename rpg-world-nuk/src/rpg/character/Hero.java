package rpg.character;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Hero extends Character {
	Sword sword;
	
	public Hero(String name) {
		super(name, 100);
	}
	public Hero(String name, int hp) {
		super(name, hp);
		this.sword = new Sword("炎の剣");
	}
	
	@Override	
	public void attack(Monster m) {
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
		    (this.getName() + "の " + mm.getType() + mm.getSuffix() + "への攻撃");
		} else {
			System.out.println
		    (this.getName() + "の " + m.getType() + "への攻撃");
		}
	    m.setHp(m.getHp() - 10); 
		System.out.println("10ポイントのダメージを与えた");
		System.out.println(m);
	}
	
	@Override
	public void fight(Monster m) {
		while (this.getHp() > 0 && m.getHp() > 0) {
			this.attack(m);
			m.attack(this);
			if (this.isFight() == false) {
				System.out.println(this.getName() + "は逃げた");
				break;
			}
		}
		if (this.getHp() <= 0) {
			System.out.println(this.getName() + "は倒れた");
		}
		if (m.getHp() <= 0) {
			System.out.println(this.getName() + "は" + m.getType() + "を倒した");
		}
	}
	
	
}
