package rpg;

public class Wizard {
	String name;
	int hp;
	
	public Wizard(String name) {
		this.hp = 50;
		this.name = name;
	}
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した!");
	}
}
