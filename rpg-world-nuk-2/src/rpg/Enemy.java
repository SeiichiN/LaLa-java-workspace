package rpg;

import main.Const;
import main.Message;

public class Enemy {
	private int x;
	private int y;
	private String type = "enemy";
	
	public Enemy() {
	}
	
	public void move(Place[][] places) {
		places[y][x].setObj(null);
		places[y][x].setScene(Message.NOTHING);
		int newX = this.getX();
		int newY = this.getY();
		do {
			int dir = (int)(Math.random() * 5);
			switch (dir) {
			case 0:
				break;
			case 1:
				newX = x - 1;
				if (newX < 0) { newX = 0; }
				break;
			case 2:
				newX = x + 1;
				if (newX > Const.X_SIZE - 1) { newX = Const.X_SIZE - 1; }
				break;
			case 3:
				newY = y - 1;
				if (newY < 0) { newY = 0; }
				break;
			case 4:
				newY = y + 1;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return this.type + "(" + y + "," + x + ")";
	}
}
