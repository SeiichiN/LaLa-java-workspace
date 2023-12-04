package rpg;

public class PoisonMatango extends Matango {
	int count = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	@Override
	public void attack(Hero h) {
		super.attack(h);
		if (count > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			count--;
		}
	}
}
