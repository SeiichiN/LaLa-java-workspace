package main;

import java.util.Random;

import rpg.Board;
import rpg.Map;
import rpg.charactor.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;
import rpg.monster.NoMonster;

public class Main {
	private static Map[][] map;

	public static void main(String[] args) {
		setupMap();
		setMonsters();
		Hero h = new Hero("ミナト");
		do {
			h.move();
		} while (true);
	}
	
	private static void setupMap() {
		map = new Map[Board.Y_SIZE][Board.X_SIZE];
		for (int y = 0; y < Board.Y_SIZE; y++) {
			for (int x = 0; x < Board.X_SIZE; x++) {
//				NoMonster nm = new NoMonster();
				map[y][x] = new Map();
//				map[y][x].setMonster(nm);
			}
		}
	}
	
	private static void setMonsters() {
		setMonsterOnMap(new Matango('A'));
		setMonsterOnMap(new Goblin("ゴブリン"));
	}
	
	private static void setMonsterOnMap(Monster m) {
		int x; int y;
		do {
			x = new Random().nextInt(5);
			y = new Random().nextInt(5);
		} while (map[y][x].getMonster().getType() == "monster");
		map[y][x].setMonster(m);
	}

}
