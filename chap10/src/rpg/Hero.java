package rpg;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	public void attack(Matango m) {
		System.out.println
		    (this.name + "の マタンゴ" + m.suffix + "への攻撃");
		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
