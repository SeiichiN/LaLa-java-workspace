package rpg;
import java.util.Random;

public  class Character extends Position{
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int mgk;
	private int def;
	private int spd;
	private int buff;
	int rand = new Random().nextInt(3) + 1;
	
	public Character(String name) { this.name = name;}
	
	public void run() { System.out.println(this.name + "は逃げ出した！");}
	
	public void attack(Monster m) {
		int damage = (this.getAtk() + this.getBuff()) * rand;
		System.out.println("                                    ");
		System.out.println("『" + this.getName() + "の攻撃！』");
		System.out.println("『" + m.getName() + m.getSuffix() + "に" + damage + "ポイントのダメージを与えた！』");
		m.setHp(m.getHp() -damage);
	}
	
	// 各Getter/Setterメソッド
	
	public String getName() { return this.name;}
	
	public void setName(String name) { this.name = name;}
	
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
	
	public int getBuff() { return this.buff;}
	
	public void setBuff(int buff) { this.buff = buff;}


}
