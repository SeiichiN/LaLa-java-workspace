package rpg;

public class Hero extends Character {
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	public void attack(Monster m) {
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
		    (this.name + "の " + mm.suffix + "への攻撃");
		}
		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	@Override
	public void attack(Matango m) {
		attack(m);
		
	}

}
