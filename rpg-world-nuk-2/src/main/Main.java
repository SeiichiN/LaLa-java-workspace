package main;

import rpg.Enemy;
import rpg.Place;
import rpg.Player;
import rpg.monster.Goblin;

/**
 * Mainクラス
 * ゲーム全体を管理運営するクラス
 */
public class Main {
	// 各場所の2次元配列。各場所にオブジェクトを配置する。
	private static Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];

	public static void main(String[] args) {
		setupPlaces();
		Goblin goblin = new Goblin();
		setObject(goblin);
		System.out.println(goblin);
		Player player = new Player();
		setPlayer(player);
		System.out.println(player);
		while (true) {
			goblin.move(places);
			System.out.println(goblin);
			player.move();
			System.out.println(player);
			player.look(places);
		}
		

	}
	
	public static void setupPlaces() {
		for (int y = 0; y < places.length; y++) {
			for (int x = 0; x < places[y].length; x++) {
				Object obj = null;
				places[y][x] = new Place(x, y, obj);
			}
		}
	}
	
	public static void setPlayer(Player p) {
		Place blankPlace = getBlankPlace(places);
		p.setX(blankPlace.getX());
		p.setY(blankPlace.getY());
	}
	
	public static void setObject(Object obj) {
		Place blankPlace = getBlankPlace(places);
		blankPlace.setObj(obj);
		blankPlace.setScene("敵がいます");
		if (obj instanceof Enemy) {
			Enemy enemy = (Enemy) obj;
			enemy.setX(blankPlace.getX());
			enemy.setY(blankPlace.getY());
		}
	}
	
	public static Place getBlankPlace(Place[][] places) {
		int x, y;
		do {
			x = (int)(Math.random() * Const.X_SIZE);
			y = (int)(Math.random() * Const.Y_SIZE);
		} while (places[y][x].getObj() != null);
		return places[y][x];
	}
}
