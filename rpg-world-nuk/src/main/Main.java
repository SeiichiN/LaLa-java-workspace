package main;

import java.util.Random;

import rpg.Place;
import rpg.Player;
import rpg.character.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];
		setup(places);
		setMonster(new Matango('A'), places);
		setMonster(new Goblin(), places);
		Hero h = new Hero("ミナト");
		System.out.println(h.getLocaton());
		while (true) {
			h.move();
			System.out.println(h.getLocaton());
			h.look(places);
			String info = h.lookFor(places);
			if (info != null) {
				if (info.equals("monster")) {
					if (h.isFight()) {
						Monster m = h.getMonster(places);
						h.fight(m);
						if (m.getHp() <= 0) { 
							removeMonster(h, places);
						}
					}
				}
			}
		}
	}
	
	public static void setup(Place[][] places) {
		for (int y = 0; y < places.length; y++) {
			for (int x = 0; x < places.length; x++) {
				places[y][x] = new Place();
				places[y][x].setScene(Message.NOTHING);
			}
		}
	}

	public static void setMonster(Monster m, Place[][] places) {
		int x, y;
		do {
			x = new Random().nextInt(Const.X_SIZE);
			y = new Random().nextInt(Const.Y_SIZE);
		} while (places[y][x].getObj() != null);
		places[y][x].setObj(m);
		places[y][x].setScene(m.getType() + "がいる!");
	}
	
	public static void removeMonster(Player p, Place[][] places) {
		places[p.getY()][p.getX()].setObj(null);
		places[p.getY()][p.getX()].setScene(Message.NOTHING);
		
	}
}
