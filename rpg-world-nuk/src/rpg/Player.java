package rpg;

import java.util.Random;
import java.util.Scanner;

import main.Message;
import rpg.character.Item;
import rpg.monster.Matango;
import rpg.monster.Monster;

public abstract class Player {
	private int x;
	private int y;
	private boolean life;

	public Player() {
		this.x = new Random().nextInt(5);
		this.y = new Random().nextInt(5);
		this.life = true;
	}
	
	public void look(Place[][] places) {
		Place here = places[y][x];
		System.out.println(here.getScene());
	}

	public String lookFor(Place[][] places) {
		Place here = places[y][x];
		if (here.getObj() != null) {
			Object o = here.getObj();
			if (o instanceof Monster) {
				return "monster";
			} else {
				return "item";
			}
		}
		return null;
	}
	
	/**
	 * この getMonster() と 次の getItem() は、ほぼ同じ内容である。
	 * とすると、リフレクションを使って、両方ができるメソッドを
	 * 作成できるのではなかろうか？
	 */
	public Monster getMonster(Place[][] places) {
		Object o = places[y][x].getObj();
		if (o instanceof Monster) {
			return (Monster) o;
		} 
		return null;
	}
	
	public Item getItem(Place[][] places) {
		Object o = places[y][x].getObj();
		if (o instanceof Item) {
			return (Item) o;
		} 
		return null;
	}
		
	public boolean select2(String msg) {
		System.out.print(msg);
		String c = new Scanner(System.in).nextLine().toLowerCase();
		if (c.equals("y")) {
			return true;
		}
		return false;
	}
	
	public void gameover() {
		System.out.println("GAME OVER");
		this.life = false;
	}
	
	public boolean isFight() {
		return select2(Message.SELECT_FIGHT);
	}

	public abstract void fight(Monster m);

	public boolean isTake() {
		return select2(Message.SELECT_TAKE);
	}
	
	/**
	 * n,s,w,e で北南西東で上下左右へ移動。 ゆーざーに入力してもらう。 x,y に反映
	 */
	public void move() {
		boolean dirOK = false;
		do {
			System.out.print(Message.SELECT_MOVE);
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

	public String getLocaton() {
		return "(" + y + "," + x + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isLife() {
		return life;
	}
}
