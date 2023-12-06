package rpg;

public abstract class FlyingMonster extends Monster 
                               implements Runnable {
	@Override
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
