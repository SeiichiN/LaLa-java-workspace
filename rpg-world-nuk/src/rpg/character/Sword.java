package rpg.character;

public class Sword extends Item {
	private int damage;

	public Sword(String name) {
		super(name);
		this.damage = 10;
	}
	public Sword(String name, int damage) {
		super(name);
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

}
