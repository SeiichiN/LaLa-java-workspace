package rpg;
import java.util.Random;
import java.util.Scanner;

public class Position {
	int x  = 1;
	int y  = 1;
	Scanner scan = new Scanner(System.in);
	
	public void move() {
		System.out.println("N(↑)W(←)S(↓)E(→)を入力して下さい");
		String move = scan.next();
		
		switch (move) {
			case "n":
				this.y++;
				break;
			case "s":
				this.y--;
				break;
			case "e":
				this.x++;
				break;
			case "w":
				this.x--;
				break;
		}
		// 上記の内容を通常のif文にしてみたら下記
//		if(move.equals("n")) { this.y++;}
//		if(move.equals("s")) { this.y--;}
//		if(move.equals("e")) { this.x++;}
//		if(move.equals("w")) { this.x--;}
	}
	
	public void autoMove() {
		int randx = new Random().nextInt(5) + 1;
		int randy = new Random().nextInt(5) + 1;
		this.x = randx;
		this.y = randy;
	}
	
	public void delete(Monster m) {
		this.x = 0; this.y = 0;
	}
}
