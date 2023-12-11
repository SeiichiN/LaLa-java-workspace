package rpg;

public class DeathBat extends FlyingMonster {
	
	public DeathBat(String name, char suffix) {
		super(name,suffix);
		this.setHp(130);
		this.setMp(5);
		this.setAtk(10);
		this.setMgk(0);
		this.setDef(5);
		this.setSpd(10);
		this.setAttackWay("の超音波");
	}
}
