package rpg;

public abstract class WalkingMonster extends Monster{
	
	public WalkingMonster(String name, char suffix) {
		super(name, suffix);
	}
	
	public void run() {
		System.out.println(this.getName() + "はトコトコ走って逃げだした！");
	}
}
