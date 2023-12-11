package rpg;

import java.util.Random;
import java.util.Scanner;

import main.Const;
import main.Message;

public class Player {
	private int x;
	private int y;  
	
	public Player() {
		this.x = new Random().nextInt(Const.X_SIZE);
		this.y = new Random().nextInt(Const.Y_SIZE);
	}
	
	/**
	 * n,s,w,e で北南西東で上下左右へ移動。
	 * ゆーざーに入力してもらう。
	 * x,y に反映
	 */
	public void move() {
		boolean inputOK = false;
		do {
			System.out.println(Message.MOVE_MSG);
			String dir = new Scanner(System.in).nextLine().toLowerCase();
			inputOK = true;
			switch (dir) {
			case "n": // 上
				y -= 1;
				if (y < 0) { y = 0; }
				break;
			case "s":  // 下
				y += 1;
				if (y > Const.Y_SIZE - 1) { y = Const.Y_SIZE - 1; } 
				break;
			case "w":  // 左
				x -= 1;
				if (x < 0) { x = 0; }
				break;
			case "e":  // 右
				x += 1;
				if (x > Const.X_SIZE - 1) { x = Const.X_SIZE - 1; }
				break;
			default:
				inputOK = false;
			}
		} while(inputOK == false);
	}
	
	public String toString() {
		return "(" + y + "," + x + ")";
	}
}
