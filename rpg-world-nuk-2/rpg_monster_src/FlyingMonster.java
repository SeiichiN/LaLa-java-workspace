package rpg.monster;

import rpg.Runnable;

public abstract class FlyingMonster extends Monster 
                               implements Runnable {
	@Override
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
