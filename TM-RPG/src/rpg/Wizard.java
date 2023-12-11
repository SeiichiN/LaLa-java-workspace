package rpg;

public class Wizard extends Character {
	
	private Wand wand = new Wand();
	int buff = wand.getPower();
	
	public Wizard(String name) {
		super(name);
		this.setHp(80);
		this.setMp(70);
		this.setAtk(10);
		this.setMgk(30);
		this.setDef(10);
		this.setSpd(5);
	}
	
	public void heal(Character c) { 
		int magicPower = (int)(this.getMgk() + wand.getPower());
	    c.setHp(c.getHp() + magicPower);
	    System.out.println(" ------------------------------------");
	    System.out.println("|" + c.getName() + "のHPを" + magicPower + "回復した！");
	    System.out.println(" ------------------------------------");
	}		
}
