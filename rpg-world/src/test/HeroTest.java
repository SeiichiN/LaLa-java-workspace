package test;

import rpg.character.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;

public class HeroTest {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		h.run();
		Matango m = new Matango('A');
		h.attack(m);
		Goblin g = new Goblin();
		h.attack(g);
	}

}
