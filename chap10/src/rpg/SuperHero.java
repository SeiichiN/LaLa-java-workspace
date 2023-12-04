package rpg;

public class SuperHero extends Hero {
	boolean flying;
	
	@Override
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}	
	
	@Override 
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
}
