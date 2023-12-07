package main;

import java.util.Random;

import rpg.Map;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {
	private static Map[][] map;

	public static void main(String[] args) {
		map = new Map[5][5];
		setMonsters();
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
