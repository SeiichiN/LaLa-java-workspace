package rpg;

import java.util.Random;
import java.util.Scanner;

import rpg.monster.Matango;
import rpg.monster.Monster;

public abstract class Player {
	private int x;
	private int y;

	public Player() {
		this.x = new Random().nextInt(5);
		this.y = new Random().nextInt(5);
	}

	public String look(Place[][] places) {
		System.out.println(places[y][x].getScene());
		if (places[y][x].getObj() != null) {
			Object o = places[y][x].getObj();
			if (o instanceof Monster) {
				// Monster m = (Monster) o;
				return "monster";
			} else {
				return "item";
			}
		}
		return null;
	}
	
	public Monster getMonster(Place[][] places) {
		Object o = places[y][x].getObj();
		if (o instanceof Monster) {
			Monster m = (Monster) o;
			return m;
		} 
		return null;
	}

	public boolean isFight() {
		System.out.print("どうする?  y:たたかう  n:にげる > ");
		String c = new Scanner(System.in).nextLine().toLowerCase();
		if (c.equals("y")) {
			return true;
		}
		return false;
	}

	public abstract void fight(Monster m);

	/**
	 * n,s,w,e で北南西東で上下左右へ移動。 ゆーざーに入力してもらう。 x,y に反映
	 */
	public void move() {
		boolean dirOK = false;
		do {
			System.out.print("移動 n:上 s:下 w:左 e:右 > ");
			String dir = new Scanner(System.in).nextLine().toLowerCase();
			dirOK = true;
			switch (dir) {
			case "n":
				this.y -= 1;
				if (this.y < 0) {
					this.y = 0;
				}
				break;
			case "s":
				this.y += 1;
				if (this.y >= 5) {
					this.y = 4;
				}
				break;
			case "w":
				this.x -= 1;
				if (this.x < 0) {
					this.x = 0;
				}
				break;
			case "e":
				this.x += 1;
				if (this.x >= 5) {
					this.x = 4;
				}
				break;
			default:
				dirOK = false;
			}
		} while (dirOK == false);
	}

	public String getPlace() {
		return "(" + y + "," + x + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
