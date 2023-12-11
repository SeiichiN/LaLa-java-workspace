package main;

import rpg.Enemy;
import rpg.Place;
import rpg.Player;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];
		setupPlaces(places);
		Goblin g = new Goblin();
		setObject(g, places);
		System.out.println(g);
		Player p = new Player();
		setPlayer(p, places);
		System.out.println(p);
		while (true) {
			g.move(places);
			System.out.println(g);
			p.move();
			System.out.println(p);
			p.look(places);
		}
		

	}
	
	public static void setupPlaces(Place[][] places) {
		for (int y = 0; y < places.length; y++) {
			for (int x = 0; x < places[y].length; x++) {
				Object obj = null;
				places[y][x] = new Place(x, y, obj);
			}
		}
	}
	
	public static void setPlayer(Player p, Place[][] places) {
		Place blankPlace = getBlankPlace(places);
		p.setX(blankPlace.getX());
		p.setY(blankPlace.getY());
	}
	
	public static void setObject(Object obj, Place[][] places) {
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
