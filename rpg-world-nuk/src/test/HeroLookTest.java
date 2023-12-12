package test;

import main.Const;
import main.Main;
import rpg.Place;
import rpg.character.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;

public class HeroLookTest {
	public static void main(String[] args) {
		Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];
		Main.setup();
		Main.setObj(new Matango('A'));
		Main.setObj(new Goblin());
		Hero h = new Hero("ミナト");
		System.out.println(h.getLocaton());
		while (true) {
			h.move();
			System.out.println(h.getLocaton());
			h.look(places);
			String info = h.lookFor(places);
			System.out.println(info);
		}
	}
}
