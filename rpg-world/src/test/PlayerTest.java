package test;

import rpg.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p = new Player();
		while(true) {
			p.move();
			System.out.println(p);
		}
	}

}
