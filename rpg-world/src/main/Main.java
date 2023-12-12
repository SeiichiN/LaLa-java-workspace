package main;

import rpg.Place;
import rpg.character.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

/**
 * ゲームの管理運営を担うクラス
 */
public class Main {
	private static Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];

	public static void main(String[] args) {
		setup();
		Goblin goblin = new Goblin();
		setObject(goblin);
		Matango matango = new Matango('A');
		setObject(matango);
		
		Hero hero = new Hero("ミナト");
		System.out.println(hero.getLocation());
		while (true) {
			hero.move();
			System.out.println(hero.getLocation());
			hero.look(places);
			// 戦う / 逃げる
			// 戦い方
			// 自分が負けた場合 hp <= 0
			// モンスターが負けた場合 m.hp <= 0
			//   places[y][x].setObj(null);
		}		
	}
	
	public static void setup() {
		for (int y = 0; y < Const.Y_SIZE; y++) {
			for (int x = 0; x < Const.X_SIZE; x++) {
				places[y][x] = new Place();
			}
		}
	}
	
	public static void setObject(Object obj) {
		int x;
		int y;
		do {
			x = (int)(Math.random() * Const.X_SIZE);
			y = (int)(Math.random() * Const.Y_SIZE);
		} while (places[y][x].getObj() != null);
		places[y][x].setObj(obj);
		if (obj instanceof Monster) {
			Monster m = (Monster) obj;
			places[y][x].setScene(m.getType() + "がいた!");
		}
	}

}
