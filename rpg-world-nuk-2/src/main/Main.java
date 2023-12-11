package main;

import rpg.Place;
import rpg.Player;
import rpg.monster.Monster;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[5][5];
		Player p = new Player();
		setPlayer(p, places);
		
		

	}
	
	public static void setupPlaces(Place[][] places) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				Object o = null;
				places[y][x] = new Place(x, y, o);
			}
		}
	}
	
	public static void setPlayer(Player p, Place[][] places) {
		places[p.getY()][p.getX()].setO(p);
	}
	
	public static void setMonster(Monster m, Place[][] places) {
		int x, y;
		do {
			x = (int)(Math.random() * 5);
			y = (int)(Math.random() * 5);
		} while (places[y][x].getO() != null);
	}
}
