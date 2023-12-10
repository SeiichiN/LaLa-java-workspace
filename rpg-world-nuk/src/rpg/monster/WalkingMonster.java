package rpg.monster;

import rpg.common.Runnable;

public abstract class WalkingMonster extends Monster
                                  implements Runnable {

	public WalkingMonster(String type, int hp, int damage) {
		super(type, hp, damage);
	}
	public WalkingMonster(String type) {
		super(type);
	}
	
	@Override
	public void run() {
		System.out.println
		(this.getType() + "は走って逃げた");
	}


}
