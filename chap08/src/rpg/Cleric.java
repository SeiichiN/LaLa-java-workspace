package rpg;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public int pray(int sec) {
		int plus = new Random().nextInt(3);
		int recover = sec + plus;
		this.mp = this.mp + recover;
		int nowMp = this.mp;
		if (this.mp > this.MAX_MP) {
			this.mp = this.MAX_MP;
		}
		System.out.println(this.name + "は" + sec + "秒祈った");
		System.out.println("魔力が" + this.mp + "になった");
		return this.mp - nowMp;
	}
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は回復魔法を使った");
		System.out.println("魔力を5消費した");
		System.out.println("HPが最大になった");
	}

}
