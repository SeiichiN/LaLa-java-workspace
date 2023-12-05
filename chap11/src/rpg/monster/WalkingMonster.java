package rpg.monster;

public abstract class WalkingMonster extends Monster
                                  implements Runnable {
	@Override
	public void run() {
		System.out.println("トコトコ走って逃げる");
	}
}
