package rpg;

import java.util.Random;
import java.util.Scanner;

import main.Const;
import main.Message;
import rpg.character.Item;
import rpg.monster.Monster;

/**
 * ゲームエリアでの移動や戦いを表すクラス。
 * これを継承することで、このクラスのフィールドや
 * メソッドを子クラスで使えるようになる。
 */
public abstract class Player {
	private int x;                   // x座標
	private int y;                   // y座標
	private boolean life;            // プレーヤーの命 true:生きている

	public Player() {
		this.x = new Random().nextInt(Const.X_SIZE);
		this.y = new Random().nextInt(Const.Y_SIZE);
		this.life = true;
	}
	
	/**
	 * 現在の場所の説明(scene)を表示する
	 * @param places
	 */
	public void look(Place[][] places) {
		Place here = places[y][x];
		System.out.println(here.getScene());
	}

	/**
	 * この場所に何があるかを調べる
	 * @param places
	 * @return "monster" / "item"
	 */
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
	 * この場所のオブジェクトをMonster型にもどす
	 * @param places
	 * @return
	 */
	public Monster getMonster(Place[][] places) {
		Object o = places[y][x].getObj();
		if (o instanceof Monster) {
			return (Monster) o;
		} 
		return null;
	}
	
	/**
	 * この場所のオブジェクトをItem型にもどす
	 * @param places
	 * @return
	 */
	public Item getItem(Place[][] places) {
		Object o = places[y][x].getObj();
		if (o instanceof Item) {
			return (Item) o;
		} 
		return null;
	}
	
	/**
	 * "y"か"n"かを選択させる。
	 * "y"ならtrue。
	 * @param msg
	 * @return
	 */
	public boolean selectYorN(String msg) {
		System.out.print(msg);
		String c = new Scanner(System.in).nextLine().toLowerCase();
		if (c.equals("y")) {
			return true;
		}
		return false;
	}
	
	/**
	 * このdie()メソッドは子クラスのCharacterクラスから呼ばれる。
	 */
	public void die() {
		System.out.println("GAME OVER");
		this.life = false;
	}
	
	public boolean isFight() {
		return selectYorN(Message.SELECT_FIGHT);
	}

	/**
	 * fight()メソッドはCharacterクラスで実装。
	 * このクラスで抽象メソッドとしておくことで、
	 * このクラスでfight()メソッドを呼ぶことができる。
	 * @param m
	 */
	public abstract void fight(Monster m);

	public boolean isTake() {
		return selectYorN(Message.SELECT_TAKE);
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
			case "l":
				// System.out.println(this.getLocaton());
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
