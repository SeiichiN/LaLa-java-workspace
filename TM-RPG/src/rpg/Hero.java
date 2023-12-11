package rpg;

public class Hero extends Character{
	
	public Hero(String name) {
		super(name);
		this.setHp(100);
		this.setMp(20);
		this.setAtk(30);
		this.setMgk(10);
		this.setDef(25);
		this.setSpd(10); 
	}
}
