package main;

import java.util.Random;

import rpg.Place;
import rpg.Player;
import rpg.character.Hero;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[5][5];
		setup(places);
		setMonster(new Matango('A'), places);
		Hero h = new Hero("ミナト");
		System.out.println(h.getPlace());
		while (true) {
			h.move();
			System.out.println(h.getPlace());
			String type = h.look(places);
			if (type != null) {
				if (type.equals("monster")) {
					if (h.isFight()) {
						Monster m = h.getMonster(places);
						h.fight(m);
					}
				}
			}
		}
	}
	
	public static void setup(Place[][] places) {
		for (int y = 0; y < places.length; y++) {
			for (int x = 0; x < places.length; x++) {
				places[y][x] = new Place();
				places[y][x].setScene("特に何も見当たらない");
			}
		}
	}

	private static void setMonster(Monster m, Place[][] places) {
		int x = new Random().nextInt(5);
		int y = new Random().nextInt(5);
		places[y][x].setObj(m);
		places[y][x].setScene(m.getType() + "がいる!");
	}
}
