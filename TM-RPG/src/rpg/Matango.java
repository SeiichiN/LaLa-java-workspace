package rpg;

public class Matango extends WalkingMonster {
 
	  public Matango(String name, char suffix) {
		  super(name, suffix);
		  this.setHp(120);
		  this.setMp(10);
		  this.setAtk(7);
		  this.setMgk(7);
		  this.setDef(10);
		  this.setSpd(5);
		  this.setAttackWay("の体当たり");
	  } 
}
