package rpg;

import java.util.Random;
import java.util.Scanner;

import main.Main;
import rpg.monster.Monster;

public abstract class Player {
	private int x;
	private int y;
	
	public Player() {
		this.x = new Random().nextInt(Board.X_SIZE);
		this.y = new Random().nextInt(Board.Y_SIZE);
	}
	
	public void move() {
		System.out.println("現在位置(" + y + ","+ x + ") 移動方向は？");
		boolean inputOK = false;
		while (inputOK == false) {
			inputOK = true;
			System.out.print("n:北 s:南 w:西 e:東 > ");
			String dir = new Scanner(System.in).nextLine().toLowerCase();
			switch (dir) {
			case "s":
				y += 1;
				if (y >= Board.Y_SIZE) { y = Board.Y_SIZE - 1; }
				break;
			case "n":
				y -= 1;
				if (y < 0) { y = 0; }
				break;
			case "w":
				x -= 1;
				if (x < 0) { x = 0; }
				break;
			case "e":
				x += 1;
				if (x >= Board.X_SIZE) { x = Board.X_SIZE - 1; }
				break;
			default:
				inputOK = false;
			}
		}
	}
	
	public String checkMap() {
		int x = this.getX();
		int y = this.getY();
		Map thisMap = Main.getMap()[y][x];
		if (thisMap.getObj() != null) {
			if (thisMap.getObj() instanceof Monster) {
				Monster m = (Monster) thisMap.getObj();
				return m.toString();
			}
		}
		return "none";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
