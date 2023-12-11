package rpg;

public class Goblin extends WalkingMonster {
	
	public Goblin(String name, char suffix) {
		super(name, suffix);
		this.setHp(100);
		this.setMp(5);
		this.setAtk(5);
		this.setMgk(0);
		this.setDef(10);
		this.setSpd(1);
		this.setAttackWay("はナイフを振り回した");
	}
	
}
