package test;

import rpg.Player;

public class MoveTest {

	public static void main(String[] args) {
		Player p = new Player();
		System.out.println(p);
		while (true) {
			p.move();
			System.out.println(p);
		}

	}

}
