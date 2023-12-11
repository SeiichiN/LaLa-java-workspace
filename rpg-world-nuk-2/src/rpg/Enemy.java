package rpg;

import main.Const;
import main.Message;

/**
 * Enemyというクラスを作成する。
 * このEnemyは、xとyというint型の変数をもち、
 * move()というメソッドで自己の意思で移動する。
 *
 * これをabstractとし、Monster抽象クラスに継承させると、
 * すべてのMonsterの子クラスは自己の意思で移動できるようになる。
 */
public class Enemy {
	private int x;
	private int y;
	private String name = "enemy";
	
	public Enemy() {
	}
	
	public void move(Place[][] places) {
		places[y][x].setObj(null);
		places[y][x].setScene(Message.NOTHING);
		int newX;
		int newY;
		do {
			newX = x;
			newY = y;
			int dir = (int)(Math.random() * 5);
			switch (dir) {
			case 0:
				break;
			case 1:
				newX -= 1;
				if (newX < 0) { newX = 0; }
				break;
			case 2:
				newX += 1;
				if (newX > Const.X_SIZE - 1) { newX = Const.X_SIZE - 1; }
				break;
			case 3:
				newY -= 1;
				if (newY < 0) { newY = 0; }
				break;
			case 4:
				newY += 1;
				if (newY > Const.Y_SIZE - 1) { newY = Const.Y_SIZE - 1; }
			}
		} while(places[newY][newX].getObj() != null);
		setY(newY);
		setX(newX);
		places[y][x].setObj(this);
		places[y][x].setScene("敵です");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "(" + y + "," + x + ")";
	}

}
