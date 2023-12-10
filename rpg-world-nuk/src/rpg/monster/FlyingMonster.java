package rpg.monster;

import rpg.common.Flyable;

public abstract class FlyingMonster extends Monster 
                               implements Flyable {
	public FlyingMonster(String type, int hp, int damage) {
		super(type, hp, damage);
	}
	public FlyingMonster(String type) {
		super(type);
	}

	@Override
	public void fly() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
