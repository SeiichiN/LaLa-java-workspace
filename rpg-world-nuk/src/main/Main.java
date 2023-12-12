package main;

import java.util.Random;

import rpg.Place;
import rpg.character.Hero;
import rpg.character.Item;
import rpg.character.Sword;
import rpg.monster.DeathBat;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];
		setup(places);
		setObj(new Matango('A'), places);
		setObj(new Goblin(), places);
		setObj(new DeathBat(), places);
		setObj(new Sword("炎の剣", 20), places);
		Hero h = new Hero("ミナト");
		System.out.println(h.getLocaton());
		while (h.isLife()) {
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
							removeObj(h.getX(), h.getY(), places);
						}
					}
				}
				if (info.equals("item")) {
					if (h.isTake()) {
						Item item = h.getItem(places);
						if (item instanceof Sword) {
							Sword sword = (Sword) item;
							h.setSword(sword);
							removeObj(h.getX(), h.getY(), places);
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

	public static void removeObj(int x, int y, Place[][] places) {
		places[y][x].setObj(null);
		places[y][x].setScene(Message.NOTHING);
		
	}
	
	public static void setObj(Object obj, Place[][] places) {
		int x, y;
		do {
			x = new Random().nextInt(Const.X_SIZE);
			y = new Random().nextInt(Const.Y_SIZE);
		} while (places[y][x].getObj() != null);
		places[y][x].setObj(obj);
		if (obj instanceof Monster) {
			Monster m = (Monster) obj;
			places[y][x].setScene(m.getType() + "がいる!");
		} else if (obj instanceof Item) {
			Item item = (Item) obj;
			places[y][x].setScene(item.getName() + "が落ちている");
		}
	}
}
