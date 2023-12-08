package test;

import rpg.monster.Goblin;
import rpg.monster.Matango;

public class MonsterTest {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		m.run();
		Goblin g = new Goblin();
		g.run();
	}

}
