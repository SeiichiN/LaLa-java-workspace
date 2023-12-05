package suika;

import java.util.Random;
import java.util.Scanner;

public class User {
	int x;
	int y;
	
	public User() {
		this.x = new Random().nextInt(Const.BOARD_SIZE_X);
		this.y = new Random().nextInt(Const.BOARD_SIZE_Y);
	}
	
	public void move() {
		boolean inputOK = false;
		while (!inputOK) {
			System.out.print("移動: n(北) s(南) w(西) e(東) > ");
			String dir = new Scanner(System.in).nextLine().toLowerCase();
			inputOK = true;
			switch (dir) {
			case "n":
				this.y -= 1;
				if (this.y < 0) { this.y = 0; }
				break;
			case "s":
				this.y += 1;
				if (this.y > Const.BOARD_SIZE_Y - 1) { this.y = Const.BOARD_SIZE_Y - 1; }
				break;
			case "w":
				this.x -= 1;
				if (this.x < 0) { this.x = 0; }
				break;
			case "e":
				this.x += 1;
				if (this.x > Const.BOARD_SIZE_X - 1) { this.x = Const.BOARD_SIZE_X - 1; }
				break;
			default:
				inputOK = false;
			}
		}
	}
}
