package rpg;

public class Enemy {
	private int x;
	private int y;
	
	public Enemy() {
		this.x = (int)(Math.random() * 5);
		this.y = (int)(Math.random() * 5);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
