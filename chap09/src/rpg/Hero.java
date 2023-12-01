package rpg;

public class Hero {
	String name;
	int hp;
	Sword sword;
	
	public Hero() {
		this("ダミー");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
		this.sword = new Sword("炎の剣");   // Swordインスタンス
	}
	
	public void attack() {
		System.out.println
			(this.name + "は" + this.sword.name + "で攻撃した!");
		System.out.println("敵に" + this.sword.damage + "ポイントのダメージを与えた!");
	}
	
}
