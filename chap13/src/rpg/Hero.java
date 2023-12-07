package rpg;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;
	
	public Hero() {}
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			    ("名前がnull");
		}
		this.name = name;
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	
	public void minusHp(int hp) {
		this.hp -= hp;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}
	
	public void attack(Matango m) {
		System.out.println
		    (this.name + "の " + m.suffix + "への攻撃");
		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
