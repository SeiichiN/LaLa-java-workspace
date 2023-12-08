package rpg;

import java.util.Random;

public class Player {
	private int x;
	private int y;
	
	public Player() {
		this.x = new Random().nextInt(5);
		this.y = new Random().nextInt(5);
	}
	
	/**
	 * n,s,w,e で北南西東で上下左右へ移動。
	 * ゆーざーに入力してもらう。
	 * x,y に反映
	 */
	public void move() {
		
	}
	
	public String toString() {
		return "(" + y + "," + x + ")";
	}
}
