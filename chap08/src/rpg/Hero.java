package rpg;

import java.util.Random;

public class Hero {
	String name;
	int hp;

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った!");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	public void slip() {
		int damage = new Random().nextInt(5) + 1;
		this.hp -= damage;
		System.out.println(this.name + "は、ころんだ!");
		System.out.println(damage + "のダメージ!");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
