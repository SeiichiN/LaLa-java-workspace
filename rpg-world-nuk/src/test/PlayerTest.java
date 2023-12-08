package test;

import rpg.Player;
import rpg.character.Hero;

public class PlayerTest {

	public static void main(String[] args) {
		Hero p = new Hero("ミナト");
		System.out.println(p);
		while(true) {
			p.move();
			System.out.println(p);
		}
	}

}
