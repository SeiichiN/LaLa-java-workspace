package rpg;

import java.util.Random;

public class Monster extends Position {
	private String name;
	private char suffix;
	private int hp;
	private int mp;
	private int atk;
	private int mgk;
	private int def;
	private int spd;
	int rand = new Random().nextInt(3) + 1;
	private String attackWay = "の攻撃";

	
	public Monster(String name, char suffix) {
		  this.suffix = suffix;
		  this.name = name;
	  }
	
	public void attack(Character c) {
		int damage = this.getAtk() * rand;
		System.out.println("                                    ");
		System.out.println("『" + this.getName() + this.getSuffix() + this.getAttackWay() + "！』");
		System.out.println("『" + c.getName() + "に" + damage + "ポイントのダメージを与えた！』");
		System.out.println("                                    ");
		c.setHp(c.getHp() -damage);
	}
	
	public void run() { System.out.println(this.name + this.suffix + "は逃げ出した!");}
	
	// 各Getter/Setterメソッド
	
	public String getName() { return this.name;}
	
	public void setName(String name) { this.name = name;}
	
	public char getSuffix() { return this.suffix;}
	
	public void setSuffix(char suffix) { this.suffix = suffix;}
	
	public int getHp() { return this.hp;}
	
	public void setHp(int hp) { this.hp = hp;}
	
	public int getMp() { return this.mp;}
	
	public void setMp(int mp) { this.mp = mp;}
	
	public int getAtk() { return this.atk;}
	
	public void setAtk(int atk) { this.atk = atk;}
	
	public int getMgk() { return this.mgk;}
	
	public void setMgk(int mgk) { this.mgk = mgk;}
	
	public int getDef() { return this.def;}
	
	public void setDef(int def) { this.def = def;}
	
	public int getSpd() { return this.spd;}
	
	public void setSpd(int spd) { this.spd = spd;}
	
	public String getAttackWay() { return this.attackWay;}
	
	public void setAttackWay(String attackWay) { this.attackWay = attackWay;}




}
