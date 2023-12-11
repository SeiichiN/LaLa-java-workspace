package rpg;

public abstract class FlyingMonster extends Monster{
	
	public FlyingMonster(String name, char suffix) {
		super(name, suffix);
	}
	
	public void run() {
		System.out.println(this.getName() + "はバサバサ飛んで逃げだした！");
	}

}
