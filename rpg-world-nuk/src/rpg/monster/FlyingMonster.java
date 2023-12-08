package rpg.monster;

import rpg.Flyable;

public abstract class FlyingMonster extends Monster 
                               implements Flyable {
	public FlyingMonster(String type, int hp) {
		super(type, hp);
	}
	public FlyingMonster(String type) {
		super(type);
	}

	@Override
	public void fly() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
